package com.github.zhangquanli.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config/client")
public class ConfigClientController {

    @Value("${config.test}")
    private String test;

    @RequestMapping("/test")
    public String test() {
        return test;
    }
}
