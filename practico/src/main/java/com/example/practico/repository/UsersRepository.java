package com.example.practico.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.practico.entity.User;

@Repository
public interface  UsersRepository extends JpaRepository<User, String> {
    User getUserByEmail(String email );
    void deleteUserByEmail(String email);
}
