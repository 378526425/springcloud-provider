package com.springcloud.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: provider
 * @description:
 * @author: Mr.Wang
 * @create: 2021-06-17 16:36
 **/

@RestController
@RefreshScope
public class HelloController {
    @Value("${username}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Nacos Discovery "+this.port;
    }
}
