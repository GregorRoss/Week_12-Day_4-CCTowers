import main.Booking;
import main.Hotel;
import main.RoomType;
import main.guest.Guest;
import main.room.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Hotel hotel;
    Booking booking1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;


    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(101, RoomType.SINGLE,50.00);
        bedroom2 = new Bedroom(102, RoomType.DOUBLE,100.00);
        bedroom3 = new Bedroom(103, RoomType.TRIPLE,150.00);
        bedroom4 = new Bedroom(104, RoomType.FAMILY,200.00);
        guest1 = new Guest("Fred", false);
        guest2 = new Guest("Wilma", true);
        guest3 = new Guest("Barney", false);
        guest4 = new Guest("Betty", true);
    }

    @Test
    public void getTotalBill(){
        Booking booking = hotel.bookRoom(bedroom1,2);
        assertEquals(100.00,booking.getTotalBill(), 0.0);

    }



}
