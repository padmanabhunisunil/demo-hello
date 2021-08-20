package com.sunilapps.demohello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoHelloController {
    @RequestMapping("/")
    public String hello() {
        Date todayDateTime = new Date();
        return "Sunil - Hello World.. Current Date and Time: "+todayDateTime;
    }
}
