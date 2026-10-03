package org.example;

import org.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class OrderService
{
    private NotificationService notificationService;


//    public OrderService( NotificationService notificationService)
//    {
//        this.notificationService = notificationService;
//    }

    void placeOrder()
    {
        String message = "Order is placed";
        System.out.println(message);
        notificationService.sendNotification(message);
    }

    @Autowired
    public void setNotificationService(@Qualifier("Email") NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }
}
