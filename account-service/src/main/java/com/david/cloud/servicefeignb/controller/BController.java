package com.david.cloud.servicefeignb.controller;

import com.david.cloud.sericefeign.controller.api.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {

    @Autowired
    private HiService hiServicel;


    @Value("${a}")
    private String a;

    @GetMapping(value = "/sayHi")
    public String sayHi(@RequestParam String name) {

        return hiServicel.sayHi(name);
    }
}
