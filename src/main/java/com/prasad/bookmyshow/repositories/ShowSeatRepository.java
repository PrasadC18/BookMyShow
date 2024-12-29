package com.prasad.bookmyshow.repositories;

import com.prasad.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

    //select * from show_seats where id IN (1, 2, 3, 4, 5)
    @Override
    List<ShowSeat> findAllById(Iterable<Long> showSeatIds);

    @Override
    ShowSeat save(ShowSeat showSeat);
    /*
    Update + Insert => Upsert
     */
}
