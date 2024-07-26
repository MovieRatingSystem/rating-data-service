package org.bookish.Controller;

import org.bookish.Model.Rating;
import org.bookish.Model.RatingList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RatingController {

    @RequestMapping("rating/{userId}")
    public RatingList getRating(@PathVariable Integer userId){

        RatingList ratingList = new RatingList();
        List<Rating> lr = new ArrayList<>();
        lr.add(new Rating(1,1,"4"));
        lr.add(new Rating(2,2,"5"));
        lr.add(new Rating(3,3,"3"));
        ratingList.setRatings(lr);
        return ratingList;
    }
}
