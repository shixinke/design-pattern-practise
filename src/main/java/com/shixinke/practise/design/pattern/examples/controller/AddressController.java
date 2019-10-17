package com.shixinke.practise.design.pattern.examples.controller;

import com.shixinke.practise.design.pattern.examples.entity.Address;
import com.shixinke.practise.design.pattern.examples.service.AddressService;
import com.shixinke.practise.design.pattern.examples.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AddressController {

    @Resource
    private AddressService addressService;

    @Resource
    private UserService userService;

    @RequestMapping("/address")
    public String address() {
        /*System.out.println(addressService);
        System.out.println(userService);*/
        final Address address = new Address();
        address.setId(10L);
        address.setName("地址一");
        userService.setAddress(address);
        System.out.println("normal:");
        System.out.println(address);
        userService.setFinalAddress(address);
        System.out.println("final:");
        System.out.println(address);

        return "ok";
    }
}
