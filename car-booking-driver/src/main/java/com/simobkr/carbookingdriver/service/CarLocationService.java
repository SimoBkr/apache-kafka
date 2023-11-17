package com.simobkr.carbookingdriver.service;

import com.simobkr.carbookingdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CarLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.CAR_LOCATION,location);
        return true;
    }
}
