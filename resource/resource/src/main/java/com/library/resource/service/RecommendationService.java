package com.library.resource.service;

import com.library.resource.model.Recommendation;
import com.library.resource.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {
    @Autowired
    private RecommendationRepository recommendationRepository;

    public List<Recommendation> getRecommendations(Long userId) {
        return recommendationRepository.findByUserId(userId);
    }
}