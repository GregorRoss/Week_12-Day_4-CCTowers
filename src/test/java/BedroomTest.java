import main.RoomType;
import main.guest.Guest;
import main.room.Bedroom;
import main.room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before(){
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
    public void hasRoomNumber(){
        assertEquals(101,bedroom1.getRoomNumber());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom1.addGuest(guest1);

        assertEquals(1,bedroom1.getTotalGuests());
        assertEquals(true,guest1.isCheckedIn());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0,bedroom1.getTotalGuests());
    }

}
