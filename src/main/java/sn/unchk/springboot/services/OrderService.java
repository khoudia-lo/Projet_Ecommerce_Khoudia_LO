package sn.unchk.springboot.services;

import sn.unchk.springboot.entity.Order;
import sn.unchk.springboot.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> listOrders() {
        return orderRepository.findAll();
    }
}