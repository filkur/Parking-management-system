package ParkingApp.MenuApp;

import java.util.Scanner;

public class SelectNumber {
    private static int number;
    private static final Scanner scan = new Scanner(System.in);

    public static int getNumber() {
        try {
            number = scan.nextInt();
        } catch (Exception exception){
            System.out.println("Didn't select a number "+exception.getMessage());
            return 0;
        }
        return number;
    }
}
