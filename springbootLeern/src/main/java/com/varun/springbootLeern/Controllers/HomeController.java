package com.varun.springbootLeern.Controllers;

import com.varun.springbootLeern.Config.VarunConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("${mykeys.profilepath}")
    private String ProfilePath;
    @Autowired
    private VarunConfig varunconfig;

    @RequestMapping("/getNumbers")
    public List<Integer> getNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        return numbers;
    }
    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.ProfilePath;
    }

    @RequestMapping("/getAdminConfig")
    public VarunConfig getvarunConfig(){
        return varunconfig;
    }




}
