package com.shixinke.practise.design.pattern.content.creation.prototype.deep;


/**
 * 用户实体(原型对象)
 * @author shixinke
 */
public class User implements Cloneable {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 收货地址
     */
    private Address address;


    public User(Long userId, String nickname, String mobile, Address address) {
        this.userId = userId;
        this.nickname = nickname;
        this.mobile = mobile;
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Object clone() {
        try {
            User user =  (User)super.clone();
            user.address = (Address)this.address.clone();
            return user;
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
            return null;
        }
    }
}
