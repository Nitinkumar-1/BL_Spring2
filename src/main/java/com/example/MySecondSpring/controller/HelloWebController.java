package com.example.MySecondSpring.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;
@RestController
@RequestMapping("/hello")
public class HelloWebController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello from BridgeLabz";
        }
        @GetMapping("/web")
            public String hello(){
                return "hello";
            }
    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This is custom greeting");
        return "message";
    }


}
