package org.example;

import org.notification.EmailService;
import org.notification.NotificationService;
import org.notification.SMSNotification;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(OrderService.class).placeOrder();

    }
}
