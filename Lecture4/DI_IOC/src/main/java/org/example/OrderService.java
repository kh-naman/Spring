package org.example;

import org.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    private final NotificationService notificationService;

    @Autowired
    public OrderService(@Qualifier("emailService") NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    void placeOrder()
    {
        String message = "Order is placed";
        System.out.println(message);
        notificationService.sendNotification(message);
    }

//    public void setNotificationService(NotificationService notificationService)
//    {
//        this.notificationService = notificationService;
//    }
}
