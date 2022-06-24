package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

@RestController
public class SController {

    @GetMapping("/get")
    public String getData(){
        User u, u1;
        u = new User(); 
        u.setId("1");
        u.setName("name");
        
        return u.getId() + " Name is " + u.getName();
    }
}
