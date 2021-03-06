package com.qinchy.pluginusagedemo.controller;

import com.qinchy.hellomavenannotation.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Api(desc="测试",author = "qinchy")
    @GetMapping(path = "/test")
    public Date test(String name){
        return new Date();
    }
}
