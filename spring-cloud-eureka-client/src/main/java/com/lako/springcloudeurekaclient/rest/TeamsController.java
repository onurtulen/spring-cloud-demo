package com.lako.springcloudeurekaclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {

    @Value("${topics}")
    String topics;

    @GetMapping("/")
    public @ResponseBody String getRandom(){
        String[] topicsArr = topics.split(",");
        int i = (int)Math.round(Math.random() * (topicsArr.length - 1));
        return topicsArr[i];
    }
}
