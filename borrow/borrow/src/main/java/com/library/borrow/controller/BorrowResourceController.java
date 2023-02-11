package com.library.borrow.controller;

import com.library.borrow.VO.ResponsesTemplate;
import com.library.borrow.service.BorrowResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/borrows")
public class BorrowResourceController {
    @Autowired
    private BorrowResourceService borrowResourceService;

//    @GetMapping("/borrowResources")
//    public BorrowResource getBorrowResource(@RequestParam String resourceName) {
//        return borrowResourceService.getBorrowResource(resourceName);
//    }
//
//    @GetMapping("/checkAvailability")
//    public boolean checkAvailability(@RequestParam String resourceName) {
//        return borrowResourceService.checkAvailability(resourceName);
//    }
//
//    @PutMapping("/updateAvailability")
//    public void updateAvailability(@RequestParam String resourceName, @RequestParam boolean isAvailable) {
//        borrowResourceService.updateAvailability(resourceName, isAvailable);
//    }

    @PostMapping
    public ResponsesTemplate borrowBook(@RequestBody Long id){
        return borrowResourceService.borrowBook(id);

    }
}