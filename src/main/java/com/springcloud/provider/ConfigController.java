package com.springcloud.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: provider
 * @description:
 * @author: Mr.Wang
 * @create: 2021-06-18 11:35
 **/

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    /*@Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }*/
}