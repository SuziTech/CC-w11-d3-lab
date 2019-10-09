import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;



    @Before
    public void setUp() throws Exception {

        guest1 = new Guest("Mary");
        guest2 = new Guest("Tarquinette");
        guest3 = new Guest("Bob");
        guest4 = new Guest("Johnny");
    }

    @Test
    public void canCheckInGuest() {
        assertEquals(true, checkIn());
    }
}
