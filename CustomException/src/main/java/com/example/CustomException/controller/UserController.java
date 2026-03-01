package com.example.CustomException.controller;




import com.example.CustomException.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {

        if (id != 1) {
            throw new UserNotFoundException("User with ID " + id + " does not exist");
        }

        return "User Found: Suresh";
    }
}
