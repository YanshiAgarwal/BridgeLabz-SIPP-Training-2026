// Electric Vehicle Charging Network 
// Scenario: A charging company manages EV charging stations.
// Requirements: Create a class ChargingStation.
// Static Variables : totalStations, electricityRate
// Instance Variables: stationId, unitsConsumed
// Constructor: Initialize stationId using this, Increment totalStations.
// Methods: calculateBill(), displayStationDetails()


class ChargingStation {
    // Static variables
    static int totalStations = 0;
    static double electricityRate = 8.5; 

    // Instance variables
    int stationId;
    double unitsConsumed;

    // Constructor
    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;

        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate);
        System.out.println("Bill Amount: ₹" + calculateBill());
        System.out.println();
    }
}

public class EVChargingNetwork {
    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 85);

        s1.displayStationDetails();
        s2.displayStationDetails();

        System.out.println("Total Charging Stations: "
                + ChargingStation.totalStations);
    }
}
