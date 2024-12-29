package com.prasad.bookmyshow.controllers;

import com.prasad.bookmyshow.dtos.*;
import com.prasad.bookmyshow.exceptions.UserNotFoundException;
import com.prasad.bookmyshow.models.User;
import com.prasad.bookmyshow.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignupResponseDto signUp(SignupRequestDto requestDto) {
        //TODO : Handle Exception (if any)
        User user = userService.signup(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword());

        SignupResponseDto responseDto = new SignupResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUserId(user.getId());
        return responseDto;
    }

    public LoginResponseDto login(LoginRequestDto requestDto) {
        LoginResponseDto responseDto = new LoginResponseDto();
        try {
            User user = userService.login(requestDto.getEmail(),
                    requestDto.getPassword());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}