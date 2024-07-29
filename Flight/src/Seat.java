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

    // Getters and setters
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
