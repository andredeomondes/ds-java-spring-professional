package com.andredeomondes.desafio01.services;

import com.andredeomondes.desafio01.entitites.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - order.getBasic()/100 * order.getDiscount() - shippingService.shipment(order);
    }


}
