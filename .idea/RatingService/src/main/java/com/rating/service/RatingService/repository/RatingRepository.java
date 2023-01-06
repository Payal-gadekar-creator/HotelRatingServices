package com.rating.service.RatingService.repository;

import com.rating.service.RatingService.entities.Rating;
import com.rating.service.RatingService.impl.RatingServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,String> {
//custom finder methods
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);


}
