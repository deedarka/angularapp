package com.starterkit.springboot.brs.controller.v1.response;

import lombok.Data;

@Data
public class LoginResponse {
    private  String status;
    private  Object response;
    private com.starterkit.springboot.brs.dto.model.user.UserDto user;
}
