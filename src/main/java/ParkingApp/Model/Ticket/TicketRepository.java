package ParkingApp.Model.Ticket;

import ParkingApp.Hibernate.HibernateUtil;
import ParkingApp.MenuApp.MenuBuyTicket.SelectTicket;
import ParkingApp.Model.Space.Space;

import java.util.Optional;

public class TicketRepository {
    public boolean addTicket(){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        Ticket ticket;
        SelectTicket selectTicket = new SelectTicket();
        ticket = selectTicket.setTicket();
        session.save(ticket);

        transaction.commit();
        session.close();
        return false;
    }
    public boolean showTicket(String vehicleId){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        boolean isTicketOk = false;
        var result = session.createQuery("from Ticket", Ticket.class).list();

        Optional<Ticket> ticket = result.stream().filter(element -> element.getVehicleId().equals(vehicleId)).findAny();

        if (ticket.isPresent())
            isTicketOk = true;
        transaction.commit();
        session.close();
        return isTicketOk;
    }
}
