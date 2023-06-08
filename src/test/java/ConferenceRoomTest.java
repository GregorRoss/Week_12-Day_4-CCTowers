import main.guest.Guest;
import main.room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(100,"ballroom");
        guest1 = new Guest("Fred", false);
        guest2 = new Guest("Wilma", true);
        guest3 = new Guest("Barney", false);
        guest4 = new Guest("Betty", true);
    }

    @Test
    public void conferenceroomHasName(){
        assertEquals("ballroom", conferenceRoom.getName());
    }

    @Test
    public void canAddGuestToRoom(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);
        assertEquals(4,conferenceRoom.getTotalGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);
        conferenceRoom.removeGuest(guest1);
        conferenceRoom.removeGuest(guest2);
        conferenceRoom.removeGuest(guest3);
        conferenceRoom.removeGuest(guest4);
        assertEquals(0,conferenceRoom.getTotalGuests());
    }
}
