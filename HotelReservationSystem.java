import java.util.*;

class Room {
    int roomNumber;
    String type;
    double price;
    boolean booked;

    Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.booked = false;
    }
}

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Deluxe", 2500));
        rooms.add(new Room(103, "Suite", 4000));

        System.out.println("Hotel Reservation System");

        System.out.println("\nAvailable Rooms:");

        for (Room r : rooms) {

            if (!r.booked) {
                System.out.println(
                    r.roomNumber + " - " +
                    r.type + " - Rs." +
                    r.price
                );
            }
        }

        System.out.print("\nEnter room number to book: ");
        int roomNumber = sc.nextInt();

        Room selectedRoom = null;

        for (Room r : rooms) {

            if (r.roomNumber == roomNumber) {
                selectedRoom = r;
                break;
            }
        }

        if (selectedRoom == null) {

            System.out.println("Room not found");

        } else if (selectedRoom.booked) {

            System.out.println("Room is already booked");

        } else {

            System.out.print("Enter customer name: ");
            String name = sc.next();

            selectedRoom.booked = true;

            System.out.println("\nRoom booked successfully");
            System.out.println("Customer Name: " + name);
            System.out.println("Room Number: " + selectedRoom.roomNumber);
            System.out.println("Room Type: " + selectedRoom.type);
            System.out.println("Room Price: Rs." + selectedRoom.price);

            System.out.println("\nPayment Simulation");
            System.out.println("Payment of Rs." +
                    selectedRoom.price + " completed");

            System.out.println("Booking Confirmed");
        }

        sc.close();
    }
}