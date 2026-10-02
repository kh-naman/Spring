package org.example;

import org.notification.NotificationService;

public class OrderService
{
    private NotificationService notificationService;

    public OrderService(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public OrderService()
    {

    }

    void placeOrder()
    {
        String message = "Order is placed";
        System.out.println(message);
        notificationService.sendNotification(message);
    }

    public void setNotificationService(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }
}
