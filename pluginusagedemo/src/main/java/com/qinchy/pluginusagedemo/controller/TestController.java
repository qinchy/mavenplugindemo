package com.qinchy.pluginusagedemo.controller;

import com.qinchy.hellomavenannotation.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Api(desc="测试",author = "qinchy")
    @GetMapping(path = "/test")
    public String test(String name){
        return "hello:"+name;
    }
}
