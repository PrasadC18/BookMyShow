package com.prasad.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateBookingRequestDTO {
    private Long userId;
    private Long showId; // Can be skipped as we have showSeatId's
    private List<Long> showSeatIds;
}
