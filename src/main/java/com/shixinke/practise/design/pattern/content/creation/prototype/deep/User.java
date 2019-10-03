package com.shixinke.practise.design.pattern.content.creation.prototype.deep;

import java.util.Date;
import java.util.List;

/**
 * 用户实体
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

    private List<Long> prettyIds;

    private Date birthday;

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

    public List<Long> getPrettyIds() {
        return prettyIds;
    }

    public void setPrettyIds(List<Long> prettyIds) {
        this.prettyIds = prettyIds;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
            return null;
        }
    }
}
