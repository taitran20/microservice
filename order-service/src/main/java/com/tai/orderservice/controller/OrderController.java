package com.tai.orderservice.controller;

import com.tai.orderservice.dto.OrderRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    public ResponseEntity<Object> placeOrder(@RequestBody OrderRequest orderRequest){
        return ResponseEntity.ok().body("OK");
    }
}
