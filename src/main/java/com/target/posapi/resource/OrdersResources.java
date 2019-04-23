package com.target.posapi.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.target.posapi.models.Order;
import com.target.posapi.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("pos/api/orders")
public class OrdersResources {
    private OrderRepository orderRepository;

    public OrdersResources(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @PostMapping
    @JsonCreator
    public void insert(@RequestBody Order order){
        this.orderRepository.insert(order);
    }

    @PutMapping
    @JsonCreator
    public void update(@RequestBody Order order){
        this.orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
}
