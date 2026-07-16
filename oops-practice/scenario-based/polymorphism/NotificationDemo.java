class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending notification...");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName +
                " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipientName +
                " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push notification sent to " +
                recipientName + " : " + message);
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification("Yanshi", "Your order has been shipped."),
            new SMSNotification("Rahul", "Your OTP is 4567."),
            new PushNotification("Anjali", "New offer available!")
        };

        System.out.println("Sent Notifications:\n");

        for (Notification n : notifications) {
            n.sendNotification();    // Dynamic Method Dispatch
        }
    }
}