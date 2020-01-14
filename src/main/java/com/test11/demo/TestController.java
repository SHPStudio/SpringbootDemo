package com.test11.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        String json = "{\"name\":\"1231\",\"age\":123141}";
        return "hello world111";
    }
}
