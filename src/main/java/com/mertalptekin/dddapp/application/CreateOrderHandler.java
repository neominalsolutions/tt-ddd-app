package com.mertalptekin.dddapp.application;


import com.mertalptekin.dddapp.application.dto.CreateOrderRequest;
import com.mertalptekin.dddapp.service.entity.Order;
import com.mertalptekin.dddapp.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class CreateOrderHandler {

    private final OrderService orderService;

    public CreateOrderHandler(OrderService orderService) {
        this.orderService = orderService;
    }


    public  void  handle(CreateOrderRequest request){
        // validation
        // mapping
        Order entity = new Order();
        // entity.setId(1); // Auto increment
        entity.setName(request.name());
        this.orderService.Save(entity);

        // eventpublisher.send(event);

    }
}
