package com.simobkr.carbookingdriver.controller;


import com.simobkr.carbookingdriver.service.CarLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/locations")
public class CarLocationController {

    @Autowired
    private CarLocationService service;

    @PutMapping
    public ResponseEntity updateLocations() throws InterruptedException {

        int range = 100;

        while (range > 0) {

            service.updateLocation(Math.random()+" , "+Math.random());

            Thread.sleep(1000);

            range--;
        }

        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
