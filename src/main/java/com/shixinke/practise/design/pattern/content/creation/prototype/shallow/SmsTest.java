package com.shixinke.practise.design.pattern.content.creation.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * 短信测试
 * @author shixinke
 */
public class SmsTest {

    public static void main(String[] args) {
        Sms sms = new Sms(
                1000L,
                null,
                null,
                "尊敬的%s,您的订单已开始发货，请耐心等候"
        );
        SmsService smsService = new SmsService();
        List<User> userList = new ArrayList<User>(5);
        userList.add(new User(1L, "张三", "158xxxx6666"));
        userList.add(new User(2L, "李四", "159xxxx6666"));
        userList.add(new User(3L, "王五", "150xxxx6666"));
        userList.add(new User(4L, "赵六", "130xxxx6666"));
        userList.add(new User(5L, "周七", "131xxxx6666"));
        smsService.send(userList, sms);
    }
}
