package com.example.practico.service;
import java.util.List;
import com.example.practico.entity.User;

public interface UserService {
    
    public User saveUser(User user);
    public List<User> getAllUsers();
    public String deleteUserByEmail(String email);

}
