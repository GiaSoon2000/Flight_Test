public class Seat {
    private String seatNumber;
    private String seatClass;
    private boolean isAvailable;
    private Flight flight;

    public Seat(String seatNumber, String seatClass, boolean isAvailable, Flight flight) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.isAvailable = isAvailable;
        this.flight = flight;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

}
