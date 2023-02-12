package com.example.tt622023.service.onetoone;

import com.example.tt622023.dto.ResultDto;
import com.example.tt622023.dto.onetoone.UserDto;
import com.example.tt622023.entity.onetoone.User;

import java.util.List;

public interface UserService {
    ResultDto createUser(User user); // đầu vào là 1 kiểu json 2 ngoặc {} , đầu ra gọi list cũng thế
    List<UserDto> showListUser();
}
