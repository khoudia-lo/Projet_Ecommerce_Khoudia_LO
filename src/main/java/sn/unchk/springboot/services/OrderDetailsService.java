package sn.unchk.springboot.services;

import sn.unchk.springboot.entity.OrderDetails;
import sn.unchk.springboot.repository.OrderDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailsService {

    private final OrderDetailsRepository orderDetailsRepository;

    public OrderDetails addOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    public List<OrderDetails> listOrderDetails() {
        return orderDetailsRepository.findAll();
    }
}