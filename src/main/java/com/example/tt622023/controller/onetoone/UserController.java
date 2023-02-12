package com.example.tt622023.controller.onetoone;

import com.example.tt622023.dto.onetoone.UserDto;
import com.example.tt622023.entity.onetoone.User;
import com.example.tt622023.service.onetoone.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PutMapping("/create")                  //  tạo 1 user mới
    public ResponseEntity<Object> create(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }
    @GetMapping("/showList/show")           // gọ ra list user đã lưu trong db
    public ResponseEntity<List<UserDto>> show(){
        return ResponseEntity.ok(userService.showListUser());
    }
}
