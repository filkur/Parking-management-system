package ParkingApp;


import ParkingApp.Model.Ticket.TicketRepository;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkingAppTest {
    @Test
    public void showTicket_null_false(){
        //given
        var SUT = new TicketRepository();
        // then
        var result = SUT.showTicket(null);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void showTicket_Id_true(){
        //given
        var SUT = new TicketRepository();
        //then
        var result = SUT.showTicket("fake");
        //then
        Assert.assertTrue(result);
    }
}
