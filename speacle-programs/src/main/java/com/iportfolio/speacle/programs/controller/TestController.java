package com.iportfolio.speacle.programs.controller;

import com.iportfolio.speacle.data.TestEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/programs")
@RestController
public class TestController {

    @Value("${servers.security.url}")
    private String security_url;

    @GetMapping("/test")
    public String test(@RequestParam Map<String, String> requests) {
        return "hello. This is " + TestEnum.PROGRAMS + " module.";
    }
}
