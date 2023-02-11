package com.library.borrow.service;


import com.library.borrow.VO.*;
import com.library.borrow.model.BorrowResource;
import com.library.borrow.repository.BorrowResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BorrowResourceService {
    @Autowired
    private BorrowResourceRepository borrowResourceRepository;
    private final RestTemplate restTemplate;




//    public BorrowResource getBorrowResource(String resourceName) {
//        return borrowResourceRepository.findByResourceName(resourceName);
//    }
//
//    public boolean checkAvailability(String resourceName) {
//        BorrowResource borrowResource = borrowResourceRepository.findByResourceName(resourceName);
//        if (borrowResource == null) {
//            return false;
//        }
//        return borrowResource.isAvailable();
//    }
//
//    public void updateAvailability(String resourceName, boolean isAvailable) {
//        BorrowResource borrowResource = borrowResourceRepository.findByResourceName(resourceName);
//        borrowResource.setAvailable(isAvailable);
//        borrowResourceRepository.save(borrowResource);
//    }




    public ResponsesTemplate borrowBook(Long id) {

        ResponsesTemplate vo = new ResponsesTemplate();
        Optional<BorrowResource> borrowResource = borrowResourceRepository.findById(id);

        User userResponse = restTemplate.getForObject(
                "http://localhost:3000/users/" + id,
                User.class);

        Resource resourceResponse = restTemplate.getForObject(
                "http://localhost:3002/resources/" + id,
                Resource.class);

        Recommendation recommendationsResponse = restTemplate.getForObject(
                "http://localhost:3030/recommendations?userId=" + id,
                Recommendation.class);

//        Object user = ;
        Notification notification = restTemplate.getForObject(
                "http://localhost:3001/notifications",
//                new Notification(user.getEmail(), "Your book has been borrowed"),
               Notification.class);

        vo.setUser(userResponse);
        vo.setResource(resourceResponse);
        vo.setRecommendation(recommendationsResponse);
        vo.setNotification(notification);
        return vo;

//        User userResponse = restTemplate.getForObject(
//                "http://localhost:3000/users/" + id,
//                User.class);
////        User user = userResponse.getBody();


//        Resource resource = resourceResponse.getBody();

        // Perform the borrow operation, update the user and book entities, and save changes to the database

        // Call the Recommendation Service to get book recommendations for the user
//        Recommendation recommendationsResponse = restTemplate.getForObject(
//                "http://localhost:3030/recommendations?userId=" + id,
//                Recommendation.class);
//                new ParameterizedTypeReference<List<Resource>>(){});
//        List<Resource> recommendations = recommendationsResponse.getBody();

        // Call the Notification Service to send a notification to the user
//        restTemplate.getForObject(
//                "http://localhost:3001/notifications",
//                new Notification(user.getEmail(), "Your book has been borrowed"),
//                Notification.class);
//    }

    }

}