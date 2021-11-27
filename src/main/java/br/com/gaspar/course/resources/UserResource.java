package br.com.gaspar.course.resources;

import br.com.gaspar.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "João", "joao@gmail.com", "91910101", "123456");
        return ResponseEntity.ok().body(user);
    }
}
