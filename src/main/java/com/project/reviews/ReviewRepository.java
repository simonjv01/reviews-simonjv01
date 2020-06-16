package com.project.reviews;



import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;




@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review movie1 = new Review(12L, "Superman","./images/superman.jpg", "sci-fi", "superman saves earth","last son of krypton comes to earth");
        Review tech1 = new Review(13L, "Dell Laptop", "./images/dell.jpg", "slim laptop for travel", "computer mobile", "affordable and sleek");
        Review car1 = new Review(14L, "Tesla", "./images/tesla.jpg", "electric vehicle", "cars and environment",  "excellent tech, the future of cars");

        reviewList.put(movie1.getId(), movie1);
        reviewList.put(tech1.getId(), tech1);
        reviewList.put(car1.getId(), car1);


    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review reviewOne(long id) { return reviewList.get(id); }

    public Collection<Review> reviewAll() { return reviewList.values(); }

}
