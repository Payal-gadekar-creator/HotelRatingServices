package com.rating.service.RatingService.service;

import com.rating.service.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {
    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();


    //get all by userid
    List<Rating> getRatingByUserId(String userId);

    //get all by hotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
