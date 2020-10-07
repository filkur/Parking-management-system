package ParkingApp.MenuApp;

import ParkingApp.MenuApp.MenuBuyTicket.BuyTicket;
import ParkingApp.MenuApp.MenuEnterParking.EnterParking;
import ParkingApp.MenuApp.MenuExitParking.ExitParking;
import ParkingApp.MenuApp.MenuShowParking.ShowParking;

public class Menu {

    public void startapplication(){
        while (true) {
            System.out.println("PARKING SERVICE SYSTEM");
            System.out.println("1.Enter the parking lot");
            System.out.println("2.Show free parking spaces");
            System.out.println("3.Buy a ticket");
            System.out.println("4.Exit the parking lot");
            switch (SelectNumber.getNumber()){
                case 1:{
                    EnterParking.enterParkingMenu(); break;
                }
                case 2:{
                    ShowParking.showAllSpaces(); break;
                }
                case 3:{
                    BuyTicket.takeTicket(); break;
                }
                case 4: {
                    ExitParking.exitParkingSpace(); break;
                }
                default:{
                    System.out.println("ERROR- restart system");
                    System.exit(0);
                }
            }
        }
    }
}
