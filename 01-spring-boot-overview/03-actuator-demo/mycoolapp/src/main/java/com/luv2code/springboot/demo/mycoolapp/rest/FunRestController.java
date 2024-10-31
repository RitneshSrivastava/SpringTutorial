package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunRestController {
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
