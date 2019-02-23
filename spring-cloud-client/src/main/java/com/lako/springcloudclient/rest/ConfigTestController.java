package com.lako.springcloudclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @Value("${config-test}")
    String configTest;


    @GetMapping("/config-test")
    public String showConfigValues(){
        return "Config values : " + configTest;
    }
}
