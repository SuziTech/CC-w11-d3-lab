public class Guest {
    private String name;
    private boolean checkedIn;

    public Guest(String name) {
        this.name  = name;
    }

    public boolean checkIn() {
        checkedIn = true;
        return checkedIn;
    }
}

