package org.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class SMSNotification implements  NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: "+message);
    }
}
