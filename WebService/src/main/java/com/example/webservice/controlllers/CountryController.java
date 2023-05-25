package com.example.webservice.controlllers;

import com.example.webservice.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = Country.of("France",67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital","Paris")
                .header("favorite_food","Cheese and Wine")
                .body(c);
    }

    @GetMapping("/all")
    public List<Country> countries(){
        Country c1 = Country.of("Germany", 83);
        Country c2 = Country.of("United Kingdom",67);
        return List.of(c1,c2);
    }



}
