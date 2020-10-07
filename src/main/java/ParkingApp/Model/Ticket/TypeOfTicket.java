package ParkingApp.Model.Ticket;

public enum TypeOfTicket {
    HALFHOUR(1), HOUR(2), THREEHOURS(3), DAILY(4), WEEK(5);
    private final int num;

     TypeOfTicket(int num) {
        this.num = num;
    }

    public static double getTicketPrice(TypeOfTicket type){
        switch (type){
            case HALFHOUR: return 1.50;
            case HOUR: return 2.70;
            case THREEHOURS: return 3.60;
            case DAILY: return 7.00;
            case WEEK: return 30.00;
            default: return 0;
        }
    }
    public static TypeOfTicket getTicketType(int num){
        switch (num){
            case 1: return TypeOfTicket.HALFHOUR;
            case 2: return TypeOfTicket.HOUR;
            case 3: return TypeOfTicket.THREEHOURS;
            case 4: return TypeOfTicket.DAILY;
            case 5: return TypeOfTicket.WEEK;
            default: return null;
        }
    }

}