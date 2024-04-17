package com.colak.springjpatutorial.jpa;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
public class Movie extends Item {
    private String director;
    private int duration;

}
