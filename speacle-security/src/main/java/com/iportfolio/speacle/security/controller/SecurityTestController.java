package com.iportfolio.speacle.security.controller;

import com.iportfolio.speacle.data.TestEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityTestController {

    @GetMapping("/hello")
    public String helloSecurity() {
        return "hello. This is " + TestEnum.SECURITY + " module.";
    }

}
