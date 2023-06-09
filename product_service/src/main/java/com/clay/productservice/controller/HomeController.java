package com.clay.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HomeController {


    @GetMapping("/")
    public ResponseEntity<?> getHomePage(){
        return new ResponseEntity<>("Product Microservice Running", HttpStatus.OK);
    }

}
