package com.andredeomondes.desafio01.services;

import com.andredeomondes.desafio01.entitites.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() < 200) {
            return 12.0;
        } else {
            return 0.0;
        }
    }


}
