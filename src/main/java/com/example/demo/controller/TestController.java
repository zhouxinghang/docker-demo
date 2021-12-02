package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxinghang
 * @date 2021/12/1
 */
@RestController
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @Value("${app.env}")
    private String env;

    @GetMapping("/")
    public String hello() {
        return "hello k8s, env:" + env + ", ip:" +  localhost();
    }

    private String localhost() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            log.error("getLocalHost error", e);
            return "unknown";
        }
    }

}
