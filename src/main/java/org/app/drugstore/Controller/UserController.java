package org.app.drugstore.Controller;

import org.app.drugstore.Model.User;
import org.app.drugstore.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> Register(@RequestBody User user){
        try {
            User newUser = service.save(user);
            return new ResponseEntity<>(newUser, HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>> findAll() {
        List<User> users = service.findAll();
        return ResponseEntity.ok(users);
    }
    @PutMapping("/users")
    public ResponseEntity<User> save(User toSave) {
        User user = service.save(toSave);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Optional<User> user = service.findById(id);
        return user.<ResponseEntity<Object>>map(
                value -> new ResponseEntity<>(value, HttpStatus.OK)
        ).orElseGet(
                () -> ResponseEntity.ok("User not found")
        );
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok(service.deleteById(id));
    }
}
