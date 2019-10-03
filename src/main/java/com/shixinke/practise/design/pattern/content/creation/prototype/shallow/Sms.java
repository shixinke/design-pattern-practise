package com.shixinke.practise.design.pattern.content.creation.prototype.shallow;

/**
 * 短信内容实体
 * @author shixinke
 */
public class Sms implements Cloneable {
    /**
     * 短信ID
     */
    private Long id;
    /**
     * 接收者手机号
     */
    private String receiver;
    /**
     * 短信内容
     */
    private String message;
    /**
     * 短信模板
     */
    private String template;
    /**
     * 短信发送时间
     */
    private Integer createTime;

    public Sms() {

    }

    public Sms(Long id, String receiver, String message, String template) {
        this.id = id;
        this.receiver = receiver;
        this.message = message;
        this.template = template;
        this.createTime = Long.valueOf(System.currentTimeMillis() / 1000).intValue();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return message;
    }

    public String getTemplate() {
        return template;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Sms{" +
                "id=" + id +
                ", receiver='" + receiver + '\'' +
                ", message='" + message + '\'' +
                ", template='" + template + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
