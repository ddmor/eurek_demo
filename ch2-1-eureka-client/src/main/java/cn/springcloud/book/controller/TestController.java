package cn.springcloud.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // 服务消费者对位提供的服务
    @GetMapping("/test")
    public String findByIdByEurekaServer() {
        return "ok 1";

    }
}
