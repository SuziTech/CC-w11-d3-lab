import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private ConferenceRoom conferenceroom1;
    private ConferenceRoom conferenceroom2;

    @Before
    public void before() {
        bedroom1 = new Bedroom("Mariza", 2, 0, "Double");
        bedroom2 = new Bedroom("Nirvana", 1, 0, "Single");

        conferenceroom1 = new ConferenceRoom("Miller", 75, 0);
        conferenceroom2 = new ConferenceRoom("Runrig", 20, 0);
    }

    @Test
    public void hotelHasBedroomAvailable() {

        assertEquals(true, bedroom1.checkIsAvailable());
        assertEquals(true, bedroom2.checkIsAvailable());
    }

    @Test
    public void canCheckInGuest() {
        bedroom.addGuest();
    }
}
