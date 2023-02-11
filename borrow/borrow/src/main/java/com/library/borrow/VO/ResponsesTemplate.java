package com.library.borrow.VO;

import com.library.borrow.model.BorrowResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsesTemplate {

    private BorrowResource borrowResource;
    private User user;
    private Recommendation recommendation;
    private Notification notification;
    private Resource resource;
}
