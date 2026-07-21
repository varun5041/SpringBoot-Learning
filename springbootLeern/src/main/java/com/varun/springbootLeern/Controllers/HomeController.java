package com.varun.springbootLeern.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/getNumbers")
    public List<Integer> getNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        return numbers;
    }


}
