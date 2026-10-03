package org.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("emailService")
public class EmailService implements  NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}
