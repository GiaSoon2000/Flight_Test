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

        // Display flight details
        System.out.println("Flight Details:");
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Departure Airport: " + flight.getDepartureAirport());
        System.out.println("Arrival Airport: " + flight.getArrivalAirport());
        System.out.println("Departure Date: " + flight.getDepartureDate());
        System.out.println("Arrival Date: " + flight.getArrivalDate());
        System.out.println();

        // Create a passenger
        Passenger passenger = new Passenger("P001", "John Doe", "A12345678", "john.doe@example.com");

        // Display passenger details
        System.out.println("Passenger Details:");
        System.out.println("Passenger ID: " + passenger.getPassengerID());
        System.out.println("Name: " + passenger.getName());
        System.out.println("Passport Number: " + passenger.getPassportNumber());
        System.out.println("Email: " + passenger.getEmail());
        System.out.println();

        // Find available seats
        ArrayList<Seat> availableSeats = flight.findAvailableSeats();
        System.out.println("Available seats before reservation:");
        for (Seat seat : availableSeats) {
            System.out.println("Seat Number: " + seat.getSeatNumber() + ", Class: " + seat.getSeatClass() + ", Availability: " + (seat.isAvailable() ? "Available" : "Booked"));
        }
        System.out.println();

        // Create a reservation for the passenger
        if (!availableSeats.isEmpty()) {
            Seat seatToBook = availableSeats.get(0);
            Reservation reservation = passenger.createReservation(flight, seatToBook);
            System.out.println("Reservation created:");
            System.out.println("Reservation ID: " + reservation.getReservationID());
            System.out.println("Passenger: " + reservation.getPassenger().getName());
            System.out.println("Seat: " + reservation.getSeat().getSeatNumber());
            System.out.println("Flight: " + reservation.getFlight().getFlightNumber());
            System.out.println("Reservation Date: " + reservation.getReservationDate());
            System.out.println();
        }

        // Find available seats after reservation
        availableSeats = flight.findAvailableSeats();
        System.out.println("Available seats after reservation:");
        for (Seat seat : availableSeats) {
            System.out.println("Seat Number: " + seat.getSeatNumber() + ", Class: " + seat.getSeatClass() + ", Availability: " + (seat.isAvailable() ? "Available" : "Booked"));
        }
    }
}
