package org.app.drugstore.Service;

import lombok.Data;
import org.app.drugstore.Model.User;
import org.app.drugstore.Repository.UserCrudOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class UserService {

    private final UserCrudOperations userCrudOperations;
    private User user;

    @Autowired
    public UserService(UserCrudOperations userCrudOperations) {
        this.userCrudOperations = userCrudOperations;
    }
    public List<User> findAll() {
        return userCrudOperations.findAll();
    }


    public Optional<User> findById(int id) {
        return userCrudOperations.findById(id);
    }

    public User save(User toSave) {

        return userCrudOperations.save(toSave);
    }

    public String deleteById(int id) {
        userCrudOperations.deleteById(id);
        return "User deleted !";
    }
}
