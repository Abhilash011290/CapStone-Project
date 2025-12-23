package com.example.entertainment.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String language;
    private int duration;
}
