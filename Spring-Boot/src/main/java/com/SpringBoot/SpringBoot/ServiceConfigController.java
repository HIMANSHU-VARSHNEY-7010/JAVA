package com.SpringBoot.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceConfigController {
    @Autowired
    private ServiceConfig configuration;
    @RequestMapping("/service-config")
    public ServiceConfig retrieveAllAppliances(){
        return configuration;
    }

}
