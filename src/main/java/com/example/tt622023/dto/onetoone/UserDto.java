package com.example.tt622023.dto.onetoone;

import com.example.tt622023.entity.onetoone.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UserDto {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private String age;
    @JsonProperty("address")
//    @JsonIgnore
    private Address address;
}
