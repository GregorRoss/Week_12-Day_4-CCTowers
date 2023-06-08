import main.Booking;
import main.Hotel;
import main.RoomType;
import main.room.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;

    Bedroom bedroom1;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(101, RoomType.SINGLE,50.00);
    }

    @Test
    public void canBookRoom(){

        Booking booking = hotel.bookRoom(bedroom1,2);

        assertEquals(2, booking.getNumberOfNights());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1,hotel.getBedrooms().size());
    }
}
