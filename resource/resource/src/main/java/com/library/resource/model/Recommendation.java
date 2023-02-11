package com.library.resource.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long resourceId;

    // getters and setters ...
}