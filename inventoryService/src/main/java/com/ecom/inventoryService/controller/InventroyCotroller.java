package com.ecom.inventoryService.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventroy")
public class InventroyCotroller {

    @GetMapping("/{productId}")
    public String cheakInventroy(@PathVariable String productId) {

        return productId.equals("1") ? "INSTOCK" : " OUT OF STOCK";
    }
}
