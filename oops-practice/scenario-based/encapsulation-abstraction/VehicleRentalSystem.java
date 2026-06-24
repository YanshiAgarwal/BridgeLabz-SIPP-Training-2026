import java.util.Scanner;

// Abstract Class
abstract class Vehicle {

    // Private fields
    private String vehicleNumber;
    private String vehicleType;

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);
}

// Car Class
class Car extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Bike Class
class Bike extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Truck Class
class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

// Main Class
public class VehicleRentalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Car Object
        Car car = new Car();
        car.setVehicleNumber("CAR123");
        car.setVehicleType("Car");
        car.setDailyRate(50);

        // Bike Object
        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE456");
        bike.setVehicleType("Bike");
        bike.setDailyRate(20);

        // Truck Object
        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK789");
        truck.setVehicleType("Truck");
        truck.setDailyRate(100);
        truck.setLoadingCharge(30);

        // Input
        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        // Output
        System.out.println("\nVehicle Details and Rental Cost");

        System.out.println(
                "Car -> Number: " + car.getVehicleNumber()
                        + ", Type: " + car.getVehicleType()
                        + ", Cost: $" + car.calculateRentalCost(days));

        System.out.println(
                "Bike -> Number: " + bike.getVehicleNumber()
                        + ", Type: " + bike.getVehicleType()
                        + ", Cost: $" + bike.calculateRentalCost(days));

        System.out.println(
                "Truck -> Number: " + truck.getVehicleNumber()
                        + ", Type: " + truck.getVehicleType()
                        + ", Cost: $" + truck.calculateRentalCost(days));

        sc.close();
    }
}