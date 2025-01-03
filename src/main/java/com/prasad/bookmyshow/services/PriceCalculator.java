package com.prasad.bookmyshow.services;

import com.prasad.bookmyshow.models.Show;
import com.prasad.bookmyshow.models.ShowSeat;
import com.prasad.bookmyshow.models.ShowSeatType;
import com.prasad.bookmyshow.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculator {
    private ShowSeatTypeRepository showSeatTypeRepository;

    PriceCalculator(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(Show show, List<ShowSeat> showSeats) {
        int amount = 0;
        List<ShowSeatType> showSeatTypes =
                showSeatTypeRepository.findAllByShow(show);

        for (ShowSeat showSeat : showSeats) { // 10
            for (ShowSeatType showSeatType : showSeatTypes) { // 3
                if (showSeat.getSeat().getSeatType().equals(showSeatType.getSeatype())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
}
