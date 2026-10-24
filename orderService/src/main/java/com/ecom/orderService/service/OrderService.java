package com.ecom.orderService.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    private final RestTemplate restTemplate;

    @Autowired
    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String placeOrder(String productId){
        String response = restTemplate.getForObject(
                "http://localhost:9090/api/inventroy/" + productId,
                String.class);

        return "INSTOCK".equals(response) ? " ORDER PLACED SUCCESSFULLY" : " OUT OF STOCK";
    }
}