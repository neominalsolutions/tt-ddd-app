package com.mertalptekin.dddapp.service;

import com.mertalptekin.dddapp.service.entity.Order;
import com.mertalptekin.dddapp.respository.OrderRespository;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    private final OrderRespository orderRespository;

    public OrderService(OrderRespository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public void Save(Order entity){

        orderRespository.save(entity);
    }
}
