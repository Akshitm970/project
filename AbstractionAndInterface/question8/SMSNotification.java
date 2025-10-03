package AbstractionAndInterface.question8;

public class SMSNotification implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
    }
}