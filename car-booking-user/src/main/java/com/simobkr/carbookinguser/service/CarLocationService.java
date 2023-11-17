package com.simobkr.carbookinguser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CarLocationService {

   @KafkaListener(topics = "car-location",groupId = "user-group")
    public void carLocation(String location) {

       System.out.println(location);
   }
}
