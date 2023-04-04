package com.SpringBoot.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class ApplianceController {

    @RequestMapping("/appliances")
    public List<Appliance> retrieveAllAppliances(){
        return Arrays.asList(
                new Appliance(1,"Microwave", "Godrej"),
                new Appliance(2,"Fan", "Bajaj")
//                new Appliance(3,"AC", "Whirlpool")
        );
    }

}
