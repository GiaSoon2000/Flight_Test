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

    public String getReservationID() {
        return reservationID;
    }
    
}
