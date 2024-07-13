package com.prasad.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    private int rowNumber;
    private int clmNumber;
    private String number;
    private SeatType seatType;
}
