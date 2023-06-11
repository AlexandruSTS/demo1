package com.example.demo;

import com.sun.tools.javac.Main;
import message.MessageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "${apiPrefix}")
@RestController
//@CrossOrigin("http://localhost:5173")
public class ApiController {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

//    @CrossOrigin("http://localhost:5173")
    @GetMapping("/hello")
    public String hello() {
        System.out.println("##### Hello #####");
        return "Hello, CORS!";
    }

    @PostMapping("/logMyMessage")
    public ResponseEntity<MessageObject> logMessage(@RequestBody MessageObject message) {
        logger.info("Received message: {}", message.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(  message );
    }
}
