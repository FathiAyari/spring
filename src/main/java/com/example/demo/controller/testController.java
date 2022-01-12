package com.example.demo.controller;

import com.example.demo.services.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    public TestService testService;
    public testController(TestService testService) {
        this.testService=testService;
    }

    @RequestMapping(value="/12")
    public String test() {
        return testService.testservice();
    }
}
