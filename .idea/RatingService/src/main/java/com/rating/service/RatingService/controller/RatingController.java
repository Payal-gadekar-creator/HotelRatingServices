package com.rating.service.RatingService.controller;

import com.rating.service.RatingService.entities.Rating;
import com.rating.service.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    //create Rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
    return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }
//get all
    @GetMapping
    public ResponseEntity<List<Rating>> getRatings(){
    return ResponseEntity.ok(ratingService.getRatings());
    }
    //get all by userid
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }
    //get all by hotelid
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }



}
