package com.example.tt622023.service.onetoone;

import com.example.tt622023.dto.ResultDto;
import com.example.tt622023.dto.onetoone.UserDto;
import com.example.tt622023.entity.onetoone.User;
import com.example.tt622023.repository.onetoone.AddressRepository;
import com.example.tt622023.repository.onetoone.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final ModelMapper mapper;

    @Override
    // thêm mới dữ liệu dưới
//    {
//        "name": "Đinh Minh Hiếu1111",
//            "age": "20",
//            "passWord":"Hieu2002",
//            "address":{
//        "soNha":"11111",
//                "street":"xuan thanh"
//    }
//    }
    public ResultDto createUser(User user) {  // userDto là đầu vào
        try {
            userRepository.save(user);
        }catch (Exception e){
            return ResultDto.builder().code(400).message("ghi du lieu khong thanh cong").build();
        }
        return ResultDto.builder().code(200).message("thanh cong").build();
    }

    @Override
    public List<UserDto> showListUser() {
        List<User> userList = userRepository.findAll(); //  1 mảng user
        List<UserDto> userDtoList = new ArrayList<>();  //  1 mảng userDto trống
        for(User i : userList){ // map từng phần tử user thành userDto
            UserDto x = mapper.map(i,UserDto.class);
            userDtoList.add(x);                         // thêm vào mảng trống
        }
        return userDtoList;
    }

//    @Override
//    public List<User> showListUser(){
//        List<User> userList = userRepository.findAll();
//        return userList;
//    }
}
