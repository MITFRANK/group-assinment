package com.library.resource.controller;

import com.library.resource.model.Recommendation;
import com.library.resource.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {
    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Recommendation>> getRecommendations(@PathVariable Long userId) {
        List<Recommendation> recommendations = recommendationService.getRecommendations(userId);
        return new ResponseEntity<>(recommendations, HttpStatus.OK);
    }
}
