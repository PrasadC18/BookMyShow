package com.prasad.bookmyshow.controllers;

import com.prasad.bookmyshow.dtos.CreateBookingRequestDTO;
import com.prasad.bookmyshow.dtos.CreateBookingResponseDTO;
import com.prasad.bookmyshow.dtos.ResponseStatus;
import com.prasad.bookmyshow.exceptions.ShowNotFoundException;
import com.prasad.bookmyshow.exceptions.UserNotFoundException;
import com.prasad.bookmyshow.models.Booking;
import com.prasad.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingResponseDto createBooking(CreateBookingRequestDto requestDto) {
        CreateBookingResponseDto responseDto = new CreateBookingResponseDto();

        try {
            Booking booking = bookingService.createBooking(requestDto.getUserId(),
                    requestDto.getShowSeatIds(),
                    requestDto.getShowId());

            responseDto.setBookingId(booking.getId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}