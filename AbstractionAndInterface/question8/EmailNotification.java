package AbstractionAndInterface.question8;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
    }
}
