package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hi")
    public String sayHi(){
        return "<h1>Hello World</h1>";
    }

    @GetMapping("bye")
    public String sayBye(){
        return "Bye!!";
    }
}
