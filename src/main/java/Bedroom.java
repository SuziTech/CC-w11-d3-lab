import java.util.ArrayList;

public class Bedroom {
    private String name;
    private int capacity;
    private String type;
    private ArrayList<Guest> collection;

    public Room(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.collection = new ArrayList<>();
    }
 }
