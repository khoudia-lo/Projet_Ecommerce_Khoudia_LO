package sn.unchk.springboot.controller;

import sn.unchk.springboot.entity.Order;
import sn.unchk.springboot.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.listOrders();
    }
}