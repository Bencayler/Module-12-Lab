package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Option {

    @Id
    private String option;
    public Option (String option) {
        this.option = option;
    }

    public Option() {
        // No arg constructor
    }

    public String getDetails () {
        return option;
    }
}
