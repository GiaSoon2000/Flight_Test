import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a list of seats for a flight
        ArrayList<Seat> seats = new ArrayList<>();
        Flight flight = new Flight("AA123", "KUL", "SIN", new Date(), new Date(), seats);

        // Add seats to the flight
        seats.add(new Seat("1A", "Economy", true, flight));
        seats.add(new Seat("1B", "Economy", true, flight));
        seats.add(new Seat("1C", "Economy", true, flight));
        seats.add(new Seat("2A", "Business", true, flight));
        seats.add(new Seat("2B", "Business", true, flight));

        // Create a passenger
        Passenger passenger = new Passenger("P001", "John Doe", "A12345678", "john.doe@example.com");

        // Find available seats
        ArrayList<Seat> availableSeats = flight.findAvailableSeats();
        System.out.println("Available seats before reservation:");
        for (Seat seat : availableSeats) {
            System.out.println(seat.getSeatNumber());
        }

        // Create a reservation for the passenger
        if (!availableSeats.isEmpty()) {
            Seat seatToBook = availableSeats.get(0);
            Reservation reservation = passenger.createReservation(flight, seatToBook);
            System.out.println("Reservation created with ID: " + reservation.getReservationID());
        }

        // Find available seats after reservation
        availableSeats = flight.findAvailableSeats();
        System.out.println("Available seats after reservation:");
        for (Seat seat : availableSeats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}
