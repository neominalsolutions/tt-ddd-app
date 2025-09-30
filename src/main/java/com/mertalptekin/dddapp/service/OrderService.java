package com.mertalptekin.dddapp.service;

import com.mertalptekin.dddapp.application.event.OrderSummited;
import com.mertalptekin.dddapp.service.entity.Order;
import com.mertalptekin.dddapp.respository.OrderRespository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    private final OrderRespository orderRespository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public OrderService(OrderRespository orderRespository, ApplicationEventPublisher applicationEventPublisher) {
        this.orderRespository = orderRespository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void Save(Order entity){

        orderRespository.save(entity);
        // eventi publish ederek süreci OrderSubmittedListener'a devrettik.
        this.applicationEventPublisher.publishEvent(new OrderSummited(entity,"Order Submited"));
    }
}
