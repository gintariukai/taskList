package com.example.tasklist.web.dto.task;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
}