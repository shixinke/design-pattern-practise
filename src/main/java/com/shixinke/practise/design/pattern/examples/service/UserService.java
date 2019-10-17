package com.shixinke.practise.design.pattern.examples.service;

import com.shixinke.practise.design.pattern.examples.entity.Address;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Scope(value = "prototype")
public class UserService {

    @Resource
    private AddressService addressService;

    private Address finalAddress;

    public void print() {
        System.out.println(addressService);
    }

    public void setFinalAddress(final Address address) {
        address.setId(20L);
        this.finalAddress = address;
    }

    public void setAddress(Address address) {
        address.setId(30L);
        this.finalAddress = address;
    }
}
