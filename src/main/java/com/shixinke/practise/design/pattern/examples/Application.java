package com.shixinke.practise.design.pattern.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot应用
 * @author shixinke
 */
@SpringBootApplication(scanBasePackages = "com.shixinke.practise.design.pattern.examples")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
