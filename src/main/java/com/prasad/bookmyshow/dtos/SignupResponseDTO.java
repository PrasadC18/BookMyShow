package com.prasad.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDTO {
    private Long userId;
    private ResponseStatus responseStatus;
}
