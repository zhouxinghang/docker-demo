package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxinghang
 * @date 2021/12/1
 */
@RestController
public class TestController {
    @Value("${app.env}")
    private String env;

    @GetMapping("/")
    public String hello() {
        return "hello k8s, env:" + env;
    }

}
