package com.eduardodev.APISignIn.Controller;

import com.eduardodev.APISignIn.model.User;
import com.eduardodev.APISignIn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sign-in") //Mapeia os EndPoints Desenvolvidos, para receber requisições com /sign-in
public class SignInController {
        @Autowired
        private UserRepository userRepository;

    @GetMapping
    public List<User> item(){
        return userRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User Add(@RequestBody User user){
        return userRepository.save(user);
    }

}
