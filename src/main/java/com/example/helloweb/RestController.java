package com.example.helloweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@RequestParam String name){
        return "Hello " + name + "!";
    }
}
