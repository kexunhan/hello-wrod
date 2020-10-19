package com.example.hellowrod;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kxhan
 * @createTime 2020/09/28
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }
}
