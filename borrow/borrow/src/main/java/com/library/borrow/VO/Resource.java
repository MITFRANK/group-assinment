package com.library.borrow.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {

    private Long id;
    private String title;
    private String author;
    private String genre;
    private int quantity;
}
