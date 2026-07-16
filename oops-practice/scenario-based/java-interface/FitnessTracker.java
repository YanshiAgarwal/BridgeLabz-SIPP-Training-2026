interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Walking activity recorded.");
    }

    public void generateReport() {
        System.out.println("Daily fitness report generated.");
    }

    public void sendAlert() {
        System.out.println("Reminder: Drink water.");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}