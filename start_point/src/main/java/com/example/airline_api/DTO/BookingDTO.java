package com.example.airline_api.DTO;

public class BookingDTO {

    private long flightId;
    private long passengerId;
    private int seatNumber;
    private String mealPreference;

    public BookingDTO(long flightId, long passengerId, int seatNumber) {
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.seatNumber = seatNumber;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMealPreference() {
        return mealPreference;
    }

    public void setMealPreference(String mealPreference) {
        this.mealPreference = mealPreference;
    }
}
