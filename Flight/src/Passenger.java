import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String passengerID;
    private String name;
    private String passportNumber;
    private String email;
    private ArrayList<Reservation> reservations;

    public Passenger(String passengerID, String name, String passportNumber, String email) {
        this.passengerID = passengerID;
        this.name = name;
        this.passportNumber = passportNumber;
        this.email = email;
        this.reservations = new ArrayList<>();
    }

    public Reservation createReservation(Flight flight, Seat seat) {
        String reservationID = generateRandomString(8);
        Reservation reservation = new Reservation(reservationID, this, seat, flight);
        reservations.add(reservation);
        seat.setAvailability(false);
        return reservation;
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

}
