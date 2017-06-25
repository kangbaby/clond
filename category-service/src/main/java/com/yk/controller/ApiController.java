package com.yk.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by yangkang on 2017/6/1.
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/first")
    public String first(){
        return "test";
    }
}
