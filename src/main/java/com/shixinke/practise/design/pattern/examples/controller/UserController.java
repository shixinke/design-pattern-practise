package com.shixinke.practise.design.pattern.examples.controller;

import com.shixinke.practise.design.pattern.examples.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public String test() {
        userTest();
        return "success";
    }

    public void userTest() {
        new Thread(new Task()).start();
        new Thread(new Task()).start();
        new Thread(new Task()).start();
        new Thread(new Task()).start();
    }

    private class Task implements Runnable {

        public void run() {
            System.out.println(userService);
            userService.print();
        }
    }


}
