package com.example.tt622023.dto;

import lombok.*;

@RequiredArgsConstructor
@Builder
@AllArgsConstructor
//@NoArgsConstructor
@Setter
@Getter
@Data
public class ResultDto {
    private Integer code;
    private String message;
}
