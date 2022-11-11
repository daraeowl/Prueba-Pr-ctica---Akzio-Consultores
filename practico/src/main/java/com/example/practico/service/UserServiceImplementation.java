package com.example.practico.service;

import com.example.practico.entity.User;
import com.example.practico.repository.UsersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

  @Autowired
  private UsersRepository repository;

  public List<User> getAllUsers() {
    return repository.findAll();
  }

  public User getUserByEmail(String email) {
    return repository.getUserByEmail(email);
  }

  public User saveUser(User user) {
    return repository.save(user);
  }

  public String deleteUserByEmail(String email) {
    repository.deleteUserByEmail(email);
    return "User removed with the email:  " + email;
  }

  public User updateUser(User user) {
    User existingUser = repository.getUserByEmail(user.getEmail());
    existingUser.setEmail(user.getEmail());
    return repository.save(existingUser);
  }
}
