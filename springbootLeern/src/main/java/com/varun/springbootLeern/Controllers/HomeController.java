package com.varun.springbootLeern.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("${mykeys.profilepath}")
    private String ProfilePath;

    @RequestMapping("/getNumbers")
    public List<Integer> getNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        return numbers;
    }
    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.ProfilePath;
    }


}
