package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.dtos.ResponseStatus;
import com.scaler.bookmyshow.models.User;

public interface UserService {
    User signup(String name ,String email,String password);
    ResponseStatus login(String email,String password);
}
