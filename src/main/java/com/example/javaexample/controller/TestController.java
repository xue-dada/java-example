package com.example.javaexample.controller;

import com.example.javaexample.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String hello(String ss) {
        String s = testService.getStr();
        return s;
    }
}
