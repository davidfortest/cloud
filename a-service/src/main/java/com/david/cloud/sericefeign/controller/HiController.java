package com.david.cloud.sericefeign.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name;
    }
}
