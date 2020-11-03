package ParkingApp;

import ParkingApp.Model.Space.SpaceRepository;
import ParkingApp.Model.Ticket.TicketRepository;
import org.junit.Assert;
import org.junit.Test;
import java.util.Optional;

public class ParkingAppTest {
    @Test
    public void showTicket_NULL_FALSE(){
        //given
        var SUT = new TicketRepository();
        // when
        var result = SUT.showTicket(null);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void showTicket_Id_TRUE(){
        //given
        var SUT = new TicketRepository();
        //when
        var result = SUT.showTicket("fake");
        //then
        Assert.assertTrue(result);
    }
    @Test(expected = NullPointerException.class)
    public void findEmptySpaces_NULL_EXCEPTION(){
        //given + when
        SpaceRepository SUT = new SpaceRepository();
        //then
        SUT.findEmptySpaces(null);
    }
    @Test
    public void findById_NUMBER_OUT_OF_RANGE_OPTIONAl_EMPTY(){
        //given + when
        SpaceRepository SUT = new SpaceRepository();
        //then
        var result=  SUT.findById(-1);
        Assert.assertEquals(Optional.empty(), result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void updateSpace_NULL_EXCEPTION(){
        //given + when
        SpaceRepository SUT = new SpaceRepository();
        //then
        SUT.updateSpace(null);
    }
}
