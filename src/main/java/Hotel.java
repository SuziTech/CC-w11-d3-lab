import java.util.ArrayList;

public class Hotel {
    private String hotelname;
    private ArrayList<Bedroom> set;
    private ArrayList<ConferenceRoom> suite;

    public Hotel(String hotelname) {
        this.hotelname = hotelname;
        this.set = new ArrayList<Bedroom>();
        this.suite = new ArrayList<ConferenceRoom>();
    }


    public String getHotelName() {
        return this.hotelname;
    }

    public void addBedroom(Bedroom bedroom) {
        if(bedroom.checkIsAvailable()) {
            this.set.add(bedroom);
        }
    }


}
