package sn.unchk.springboot.controller;

import sn.unchk.springboot.entity.OrderDetails;
import sn.unchk.springboot.services.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order-details")
@RequiredArgsConstructor
public class OrderDetailsController {

    private final OrderDetailsService orderDetailsService;

    @PostMapping
    public OrderDetails createOrderDetails(@RequestBody OrderDetails orderDetails) {
        return orderDetailsService.addOrderDetails(orderDetails);
    }

    @GetMapping
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsService.listOrderDetails();
    }
}