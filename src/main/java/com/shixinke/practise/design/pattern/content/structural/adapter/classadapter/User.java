package com.shixinke.practise.design.pattern.content.structural.adapter.classadapter;

/**
 * 用户数据
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
     * 用户邮箱
     */
    private String email;

    /**
     * 状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Integer createTime;

    public User(Long userId, String nickname, String email, Integer status, Integer createTime) {
        this.userId = userId;
        this.nickname = nickname;
        this.email = email;
        this.status = status;
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
