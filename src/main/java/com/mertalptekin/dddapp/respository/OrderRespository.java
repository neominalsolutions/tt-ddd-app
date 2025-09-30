package com.mertalptekin.dddapp.respository;
import com.mertalptekin.dddapp.service.entity.Order;
import org.springframework.stereotype.Component;


@Component
public class OrderRespository {
    public  void save(Order order) {
        System.out.println(order);
    }
}
