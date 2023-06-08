package main;

import main.guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
        guest.setCheckedIn(true);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
        guest.setCheckedIn(false);
    }

     public int getTotalGuests(){
        return this.guests.size();
    }

}
