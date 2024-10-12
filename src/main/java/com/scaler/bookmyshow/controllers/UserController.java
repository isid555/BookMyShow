package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.ResponseStatus;
import com.scaler.bookmyshow.dtos.SignupRequestDTO;
import com.scaler.bookmyshow.dtos.SignupResponseDto;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService= userService;
    }

    @PostMapping("/signup")
    public SignupResponseDto signup(@RequestBody SignupRequestDTO signupRequestDTO){


        User user = userService.signup(
                signupRequestDTO.getName(), signupRequestDTO.getEmail(), signupRequestDTO.getPassword()
        );
        SignupResponseDto ResponseDto = new SignupResponseDto();
        ResponseDto.setEmail(user.getEmail());
        ResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        ResponseDto.setId(user.getId());
    return  ResponseDto;
    }

}
