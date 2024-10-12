package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.repositories.UserRepositories;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{
    private UserRepositories userRepositories;
    public  UserServiceImplementation(UserRepositories userRepositories){
        this.userRepositories = userRepositories;
    }

    @Override
    public User signup(String name, String email, String password) {
        Optional<User> optionalUser  = userRepositories.findByEmail(email);
        if(optionalUser.isPresent()){
            //Redirection to login
            return optionalUser.get();
        }


        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);

        return  userRepositories.save(user);


    }
}
