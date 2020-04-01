package com.zdz.eurekaservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdezhi
 * @date 2020-03-30
 */

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home() {
        System.out.println("===========");
        return "hi i am from port:" +port;
    }

}
