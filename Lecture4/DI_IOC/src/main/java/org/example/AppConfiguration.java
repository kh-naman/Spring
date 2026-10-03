package org.example;

import org.notification.EmailService;
import org.notification.NotificationService;
import org.notification.SMSNotification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({
        "org.example",
        "org.notification"
})
public class AppConfiguration {

    @Bean
    public OrderService createOrderService()
    {
        return new OrderService();
    }


    @Bean
    @Qualifier("Email")
    public NotificationService createEmailNotificationService()
    {
        return new EmailService();
    }


    @Bean
    @Qualifier("SMS")
    public NotificationService createSMSNotificationService()
    {
        return new SMSNotification();
    }
}
