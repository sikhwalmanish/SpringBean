package com.SpringBean.Spring.Bean.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @Autowired
    Vehicle vehicle;

    @GetMapping("Drive")
    public void Drive(){
        vehicle.Drive();
    }


}
