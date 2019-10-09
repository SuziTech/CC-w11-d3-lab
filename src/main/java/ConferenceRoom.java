import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> collection;

    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }
}
