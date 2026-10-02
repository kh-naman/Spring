package org.example;

import org.notification.EmailService;
import org.notification.NotificationService;
import org.notification.SMSNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        NotificationService notificationService = new SMSNotification();
//        OrderService orderService = new OrderService(notificationService); 1st method of DI via constructor
        OrderService orderService = new OrderService();
        orderService.setNotificationService(notificationService); //2nd method of DI via setter
        orderService.placeOrder();

    }
}
