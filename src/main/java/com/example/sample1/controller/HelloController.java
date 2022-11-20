package com.example.sample1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class HelloController {

    private static Logger logger = LogManager.getLogger("Logger");

    @RequestMapping("/")
    public String index() {
        logger.info("Sample message");
        return "hello";
    }
    
}
