package com.example.userservice.dto;

import lombok.Data;

@Data
public class ResponseDto {
    private DepartmentDto department;
    private UserDto user;
}
