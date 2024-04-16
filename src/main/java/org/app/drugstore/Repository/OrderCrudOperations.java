package org.app.drugstore.Repository;

import org.app.drugstore.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCrudOperations extends JpaRepository<Order , Integer> {
}
