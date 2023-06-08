import main.guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Fred", false);

    }

    @Test
    public void guestHasName(){
        assertEquals("Fred", guest.getName());
    }

    @Test
    public void guestCheckedIn(){
        assertEquals(false,guest.isCheckedIn());
    }
}
