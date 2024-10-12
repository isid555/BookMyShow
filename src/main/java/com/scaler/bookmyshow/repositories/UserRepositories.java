package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositories extends JpaRepository<User,Long> {

    //Select * from users where id = userId

    Optional<User> findByEmail(String email);

    @Override
    User save(User user);
}
