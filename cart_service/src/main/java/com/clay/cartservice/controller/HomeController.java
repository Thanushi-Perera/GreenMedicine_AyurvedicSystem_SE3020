package com.clay.cartservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<?> getHomePage(){
        return new ResponseEntity<>("Cart Microservice Running", HttpStatus.OK);
    }

}
