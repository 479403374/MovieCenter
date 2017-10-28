package com.moviecenter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FWM-ZZ on 2017/10/24.
 */
@RestController
@RequestMapping("/test")
public class testController {
    @GetMapping(value = "/hehe")
    public String getString (){
        return "hahahahhahaha";
    }
}
