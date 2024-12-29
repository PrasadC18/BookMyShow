package com.prasad.bookmyshow.repositories;

import com.prasad.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //select * from users where id = userId
    @Override
    Optional<User> findById(Long userId);

//    @Override
//    Optional<User> findBy(Long userId);

    Optional<User> findByEmail(String email);
}

/*
user_id <-> user
 */
