package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class FunRestController {

// injecting properties for cool.name and team.name

@Value("${coach.name}")
private String coachname;

@Value("${team.name}")
private String teamname;

// exposing "/teaminfo" 

@GetMapping("/teaminfo")

public String teaminfo() {
    return "Coach: " + coachname +"   " + "Teamname:"+ teamname;
}

public String getMethodName(@RequestParam String param) {
    return new String();
}


 // expose "/" that returns "Hello this is the world of backened by Ritnesh"

@GetMapping("/")
 public String sayhello() {
     return "Hello this is the world of backened by Ritnesh";
 }

 //expose a new endpoint for workout
 
 @GetMapping("/devcheck")
 public String getdailyworkout() {
    return "TO check dev";
 }
 
}
