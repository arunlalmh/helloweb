package com.example.helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {

    @GetMapping("/sayhello")
    public String sayHello(){
        return "Hello World!";
    }
}
