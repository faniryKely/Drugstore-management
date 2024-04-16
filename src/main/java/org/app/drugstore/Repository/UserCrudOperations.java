package org.app.drugstore.Repository;

import org.app.drugstore.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudOperations extends JpaRepository<User , Integer> {
}
