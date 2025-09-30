package com.mertalptekin.dddapp.application.handler;


import com.mertalptekin.dddapp.application.event.OrderSummited;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderSubmitedListener {


    @EventListener
    public void orderSubmitted(OrderSummited event) {
        // buradaki logic devam eder.
        // artık order submit olduktan sonraki süreç
        System.out.println("Order submitted");
    }

}
