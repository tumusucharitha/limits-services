package com.example.microservices.limitsservice.limitsController;

import com.example.microservices.limitsservice.configuration.Configuration;
import com.example.microservices.limitsservice.limitsModel.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimitsConfiguration(){
        return  new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

//    @GetMapping("/limits")
//    public LimitsConfiguration getLimitsConfiguration(){
//        return  new LimitsConfiguration(12, 34);
//    }
}
