package ParkingApp.MenuApp.MenuBuyTicket;

//class thad add a new ticket on database
//the id problem

import ParkingApp.Model.Ticket.Ticket;
import ParkingApp.Model.Ticket.TypeOfTicket;

import java.util.Scanner;

public class SelectTicket {
    private  Ticket ticket;
    private  int number;
    private Scanner scan = new Scanner(System.in);

    public Ticket setTicket() {
        System.out.println("Please enter the vehicle id number:");
        String vehicleId = scan.nextLine();
        System.out.println("Select type of ticket: ");
        System.out.println("1. HALFHOUR");
        System.out.println("2. HOUR");
        System.out.println("3. THREEHOURS");
        System.out.println("4. DAILY");
        System.out.println("5. WEEK");
        number = scan.nextInt();
        TypeOfTicket typeOfTicket = TypeOfTicket.getTicketType(number);
        ticket = new Ticket(vehicleId,typeOfTicket, TypeOfTicket.getTicketPrice(typeOfTicket));
        System.out.println("THE TICKET HAS BEEN PURCHASED.\n Type of ticket:: "+ticket.getType()+"\n Ticket price:: "+ticket.getPrice()+" PLN");
        return ticket;
    }
}
