package ParkingApp.MenuApp.MenuBuyTicket;

import ParkingApp.Hibernate.HibernateUtil;
import ParkingApp.MenuApp.MenuShowParking.ShowParking;
import ParkingApp.Model.Ticket.Ticket;
import ParkingApp.Model.Ticket.TicketRepository;

public class BuyTicket {
    public static boolean takeTicket(){
        TicketRepository ticketRepository = new TicketRepository();
        if (!ShowParking.showAllSpaces())
            return false;
        ticketRepository.addTicket();
        return true;
    }

}
