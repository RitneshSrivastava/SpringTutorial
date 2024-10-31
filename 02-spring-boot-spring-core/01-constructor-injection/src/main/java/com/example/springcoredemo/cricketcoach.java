package com.example.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements coach {

    @Override
    public String getdailyworkout() {
        // TODO Auto-generated method stub
        return "Gym jana bhai!!123!";
    }

}
