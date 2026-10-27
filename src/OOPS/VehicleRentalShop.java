package OOPS;

import java.util.ArrayList;
import java.util.List;

// 1. Interface
interface Rentable {
    double calculateRent(int days);
    boolean isAvailable();
}

// 2. Abstract class
abstract class Vehicle implements Rentable {
    private String id;
    private String model;
    private double dailyRate;
    private boolean available;

    public Vehicle(String id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " " + model + " (" + id + ")";
    }
}

// 3. Car class
class Car extends Vehicle {

    public Car(String id, String model, double rate) {
        super(id, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        return getDailyRate() * days;
    }

    @Override
    public String getType() {
        return "Car";
    }
}

// 4. Bike class
class Bike extends Vehicle {

    public Bike(String id, String model, double rate) {
        super(id, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = getDailyRate() * days;

        if (days >= 7) {
            rent = rent * 0.90; // 10% discount
        }

        return rent;
    }

    @Override
    public String getType() {
        return "Bike";
    }
}

// 5. Truck class
class Truck extends Vehicle {

    public Truck(String id, String model, double rate) {
        super(id, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        return getDailyRate() * days + 500;
    }

    @Override
    public String getType() {
        return "Truck";
    }
}

// 6. Customer class
class Customer {
    private String name;
    private List<Rental> rentalHistory;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentalHistory.add(rental);
    }

    public List<Rental> getRentalHistory() {
        return rentalHistory;
    }
}

// 7. Rental class
class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getTotalRent() {
        return vehicle.calculateRent(days);
    }
}

// 8. RentalShop class
class RentalShop {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) {
        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be greater than zero"
            );
        }

        Vehicle selected = null;

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                selected = vehicle;
                break;
            }
        }

        if (selected == null) {
            throw new IllegalArgumentException(
                    "Vehicle " + vehicleId + " not found"
            );
        }

        if (!selected.isAvailable()) {
            throw new IllegalStateException(
                    selected + " is already rented"
            );
        }

        selected.setAvailable(false);

        Rental rental = new Rental(selected, customer, days);
        customer.addRental(rental);

        System.out.printf(
                "%s rented %s for %d days = %.2f%n",
                customer.getName(),
                selected,
                days,
                rental.getTotalRent()
        );

        return rental;
    }

    public void giveBack(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                if (!vehicle.isAvailable()) {
                    vehicle.setAvailable(true);
                    return;
                }

                throw new IllegalStateException(
                        vehicle + " is not currently rented"
                );
            }
        }

        throw new IllegalArgumentException(
                "Vehicle " + vehicleId + " not found"
        );
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle);
            }
        }
    }
}

// 9. Main class
public class VehicleRentalShop {
    public static void main(String[] args) {

        RentalShop shop = new RentalShop();

        // Create the fleet
        shop.addVehicle(new Car("C1", "Swift", 1500));
        shop.addVehicle(new Bike("B1", "Activa", 400));
        shop.addVehicle(new Truck("T1", "Tata Ace", 2500));

        // Create customers
        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        // Rent vehicles
        shop.rent("B1", asha, 8);
        shop.rent("T1", ravi, 2);

        // Try renting the same bike again
        try {
            shop.rent("B1", ravi, 3);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Return the bike
        shop.giveBack("B1");

        // Display available vehicles
        shop.showAvailable();
    }
}
