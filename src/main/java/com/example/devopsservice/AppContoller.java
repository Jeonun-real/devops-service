package com.example.devopsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AppContoller {
    @GetMapping("/")
    public String index(){
        return "Good day";
    }
}
