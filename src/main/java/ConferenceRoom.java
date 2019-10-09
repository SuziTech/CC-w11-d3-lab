import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private int occupancy;
    private ArrayList<Guest> collection;

    public ConferenceRoom(String name, int capacity, int occupancy) {
        this.name = name;
        this.capacity = capacity;
        this.occupancy = occupancy;
        this.collection = new ArrayList<Guest>();
    }
}
