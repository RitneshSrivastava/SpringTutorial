package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class democontroller {
    //defining a private filed for the dependency

 private coach myCoach;

    //define a constructor for dependency injections

   
    @Autowired

    public democontroller(coach theCoach){
        myCoach=theCoach; 
    }

    @GetMapping("/mehnat")
    public String mehnat() {
        return myCoach.getdailyworkout();
    }
    }
    



