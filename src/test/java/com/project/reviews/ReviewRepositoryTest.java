package com.project.reviews;

import org.junit.jupiter.api.Test;


import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    Review reviewOne = new Review(12345L, "review one", "movie", " review about movie", "movie", "awesome movie");
    Review reviewTwo = new Review(12346L, "review two", "car", " review about car", "car", "awesome car");



    @Test
    public void shouldFindReviewOne() {
        Review reviewOne = new Review(12345L, "review one", "movie", " review about movie", "movie", "awesome movie");
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.reviewOne(12345L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.reviewAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);

    }



}
