package com.shixinke.practise.design.pattern.content.creation.prototype.deep;

/**
 * 用户类测试
 * @author shixinke
 */
public class UserTest {

    public static void main(String[] args) {
        Address address = new Address(100L, "浙江杭州");
        User user = new User(1L, "赵六", "15878451XXX", address);
        User temp = (User)user.clone();

        /**
         * 两个User对象(user和temp)不是同一个对象
         */
        System.out.println("user:" + user); //User@7adf9f5f
        System.out.println("temp:" + temp); //User@85ede7b
        System.out.println(user == temp); //false
        /**
         * user的address和temp的address是同一个对象
         */
        System.out.println("user.address:" + user.getAddress());//Address@5674cd4d
        System.out.println("temp.address:" + temp.getAddress());//Address@5674cd4d

        System.out.println(user.getAddress() == temp.getAddress()); //true
    }
}
