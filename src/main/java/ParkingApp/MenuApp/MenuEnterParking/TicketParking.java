package ParkingApp.MenuApp.MenuEnterParking;



import ParkingApp.Model.Ticket.TicketRepository;

import java.util.Scanner;

public class TicketParking {
    private static Scanner scan = new Scanner(System.in);
    public static boolean checkTicket(){
        System.out.println("Enter the vehicle ID from ticket");
        String vehicleId = scan.nextLine();
        TicketRepository ticketRepository = new TicketRepository();
        return ticketRepository.showTicket(vehicleId);
    }
}
