package com.shixinke.practise.design.pattern.content.creation.prototype.deep;

import java.util.Arrays;
import java.util.Date;

/**
 * 用户类测试
 * @author shixinke
 */
public class UserTest {

    public static void main(String[] args) {
        Address address = new Address(100L, "浙江杭州");
        User user = new User(1L, "赵六", "15878451XXX", address);
        user.setPrettyIds(Arrays.asList(8888L, 9999L));
        user.setBirthday(new Date());
        User temp = (User)user.clone();

        System.out.println("user:" + user);
        System.out.println("temp:" + temp);

        temp.setAddress(new Address(200L, "浙江台州"));
        temp.setPrettyIds(Arrays.asList(5555L, 3333L));
        Date date = new Date();
        date.setTime(6666666666L);
        temp.setBirthday(date);

        System.out.println("user.address:" + user.getAddress().getAddress());
        System.out.println("temp.address:" + temp.getAddress().getAddress());


        System.out.println("user.prettyIds:" + user.getPrettyIds());
        System.out.println("temp.prettyIds:" + temp.getPrettyIds());

        System.out.println("user.prettyIds:" + user.getBirthday());
        System.out.println("temp.prettyIds:" + temp.getBirthday());
    }
}
