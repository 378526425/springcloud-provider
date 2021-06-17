package com.springcloud.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: provider
 * @description:
 * @author: Mr.Wang
 * @create: 2021-06-17 16:36
 **/

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Nacos Discovery " + this.port;
    }
}
