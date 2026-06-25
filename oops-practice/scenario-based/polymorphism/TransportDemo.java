class Vehicle {
    public void fuelCost(int km) {
        System.out.println("Fuel cost calculation");
    }
}

class Car extends Vehicle {
    @Override
    public void fuelCost(int km) {
        System.out.println("Car cost = Rs. " + (km * 8));
    }
}

class Bus extends Vehicle {
    @Override
    public void fuelCost(int km) {
        System.out.println("Bus cost = Rs. " + (km * 15));
    }
}

class Bike extends Vehicle {
    @Override
    public void fuelCost(int km) {
        System.out.println("Bike cost = Rs. " + (km * 3));
    }
}

// New class added without modifying existing classes
class ElectricCar extends Vehicle {
    @Override
    public void fuelCost(int km) {
        System.out.println("Electric Car cost = Rs. " + (km * 2));
    }
}

public class TransportDemo {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        int km = 20;

        for (Vehicle v : vehicles) {
            v.fuelCost(km);      // Runtime Polymorphism

            // Using instanceof before casting
            if (v instanceof Car) {
                System.out.println("This is a Car.");
            } else if (v instanceof Bus) {
                System.out.println("This is a Bus.");
            } else if (v instanceof Bike) {
                System.out.println("This is a Bike.");
            } else if (v instanceof ElectricCar) {
                System.out.println("This is an Electric Car.");
            }
        }
    }
}