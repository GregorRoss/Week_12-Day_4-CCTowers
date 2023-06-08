package main.guest;

public class Guest {

    private String name;
    private boolean checkedIn;

    public Guest(String name, boolean checkedIn) {
        this.name = name;
        this.checkedIn = checkedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
}
