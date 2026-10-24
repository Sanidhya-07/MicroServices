package com.ecom.orderService.service;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String placeOrder(String productId){
        return  "Order Placed Successfully";
    }
}
