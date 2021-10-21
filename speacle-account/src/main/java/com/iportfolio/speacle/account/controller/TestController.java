package com.iportfolio.speacle.account.controller;

import com.iportfolio.speacle.account.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("/test")
    public ResponseEntity<?> post(@RequestBody String name) {
        return ResponseEntity.ok().body(testService.saveTestEntity(name).getName());
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?>  get(@PathVariable Long id) {
        return ResponseEntity.ok().body(testService.findTestEntityById(id).getName());
    }
}
