package AbstractionAndInterface.question8;

import javax.management.Notification;

public class mai {
    public static void main(String[] args) {
        SMSNotification notification = new SMSNotification();
        notification.sendNotification();
        EmailNotification e = new EmailNotification();
        e.sendNotification();
    }
}
