package com.library.borrow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class BorrowResource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String resourceName;
    private boolean isAvailable;

    // getters and setters
}
