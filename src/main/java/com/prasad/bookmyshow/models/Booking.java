package com.prasad.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel{
    private String bookingNumber;
    private User user;
    private Show show;
    private List<ShowSeat> showSeats;
    private int amount;
    private List<Payment> payments;
    private BookingStatus bookingStatus;
}
