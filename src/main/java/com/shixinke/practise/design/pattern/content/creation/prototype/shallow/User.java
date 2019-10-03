package com.shixinke.practise.design.pattern.content.creation.prototype.shallow;

/**
 * 用户实体
 * @author shixinke
 */
public class User {
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

    public User(Long userId, String nickname, String mobile) {
        this.userId = userId;
        this.nickname = nickname;
        this.mobile = mobile;
    }

    public Long getUserId() {
        return userId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMobile() {
        return mobile;
    }
}
