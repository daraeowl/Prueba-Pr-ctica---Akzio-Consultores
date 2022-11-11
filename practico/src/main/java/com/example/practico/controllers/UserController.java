package com.example.practico.controllers;

import com.example.practico.entity.User;
import com.example.practico.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService service;

  @PostMapping("/add")
  public String saveUser(@RequestBody User userAdded) {
    service.saveUser(userAdded);
    return "User added";
  }
    @GetMapping("/users")
    public List<User> findAllUsers() {
      return service.getAllUsers();
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody String email) {
        return service.deleteUserByEmail(email);
    }
}
