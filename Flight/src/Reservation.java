import java.util.Date;

public class Reservation {
    private String reservationID;
    private Passenger passenger;
    private Seat seat;
    private Flight flight;
    private Date reservationDate;

    public Reservation(String reservationID, Passenger passenger, Seat seat, Flight flight) {
        this.reservationID = reservationID;
        this.passenger = passenger;
        this.seat = seat;
        this.flight = flight;
        this.reservationDate = new Date();
    }

    // Getters and setters
    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
