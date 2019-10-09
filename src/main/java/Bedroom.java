import java.util.ArrayList;

public class Bedroom {
    private String name;
    private int capacity;
    private int occupancy;
    private String type;
    private ArrayList<Guest> collection;


    public Bedroom(String name, int capacity, int occupancy, String type) {
        this.name = name;
        this.capacity = capacity;
        this.occupancy = occupancy;
        this.type = type;
        this.collection = new ArrayList<Guest>();
    }

    public boolean checkIsAvailable() {
        if(this.capacity - this.occupancy == this.capacity){
            return true;
        }
        return false;
    }
 }
