package com.example.tt622023.dto.onetoone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class AddressDto {
    @JsonProperty("soNha")
    private String soNha;
    @JsonProperty("street")
    private String street;
//    @JsonProperty("user")
//    @JsonIgnore
//    private User user;
}
