package main;

import main.guest.Guest;
import main.room.Bedroom;
import main.room.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms = new ArrayList<>();
    private ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public Booking bookRoom(Bedroom bedroom, int numNights){
        Booking booking = new Booking(bedroom,numNights);
        return booking;

    }

 }
