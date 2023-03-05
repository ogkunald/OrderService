package com.nastyzera.OrderService.service;

import com.nastyzera.OrderService.model.OrderRequest;

public interface OrderService {

    long placeOrder(OrderRequest orderRequest);
    
}
