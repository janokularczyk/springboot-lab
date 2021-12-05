package com.example.springbootlab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello() {

        log.info("hello() has been called!");
        log.debug("debug: hello() has been called!");

        return "index";
    }
}
