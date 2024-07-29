import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private Date departureDate;
    private Date arrivalDate;
    private ArrayList<Seat> seats;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, Date departureDate, Date arrivalDate, ArrayList<Seat> seats) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.seats = seats;
    }

    public ArrayList<Seat> findAvailableSeats() {
        ArrayList<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

}
