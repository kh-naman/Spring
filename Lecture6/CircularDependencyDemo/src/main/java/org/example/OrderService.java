package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class OrderService {

    private PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder()
    {
        paymentService.pay();
        System.out.println("Order placed");

    }

    public void getOrderDetails(){
        System.out.println("Getting order details");
    }
}
