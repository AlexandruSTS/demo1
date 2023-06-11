package com.example.demo;

import org.springframework.web.bind.annotation.*;

//@RequestMapping(path = "${apiPrefix}")
@RestController
@CrossOrigin("http://localhost:5173")
public class ApiController {

//    @CrossOrigin("http://localhost:5173")
    @GetMapping("/hello")
    public String hello() {
        System.out.println("##### Hello #####");
        return "Hello, CORS!";
    }
}
