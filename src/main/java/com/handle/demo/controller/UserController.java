package com.handle.demo.controller;

import com.handle.demo.vo.DemoUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public DemoUser getUser() {
        DemoUser user = new DemoUser();
        user.setName("이준섭");
        user.setPassword("1234");
        user.setPhone("010-1234-5678");
        user.setAge(29);
        return user;
    };

}
