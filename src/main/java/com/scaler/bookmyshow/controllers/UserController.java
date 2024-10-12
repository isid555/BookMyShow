package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.*;
import com.scaler.bookmyshow.dtos.ResponseStatus;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequestDto loginRequestDto){
        ResponseStatus responseStatus = userService.login(loginRequestDto.getEmail() , loginRequestDto.getPassword());

        LoginResponseDto loginResponseDto = new LoginResponseDto();
        loginResponseDto.setResponseStatus(responseStatus);
        return loginResponseDto;
    }

}
