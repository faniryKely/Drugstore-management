package org.app.drugstore.Service;

import org.app.drugstore.Model.Drugs;
import org.app.drugstore.Model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderService orderService;
    private Order order;

    public List<Order> findAll() {
        return orderService.findAll();
    }
    public Optional<Order> findById(int id) {
        return orderService.findById(id);
    }
    public Order save(Order toSave) {
        return orderService.save(toSave);
    }

    public String deleteById(int id) {
        orderService.deleteById(id);
        return "Order deleted !";
    }
}
