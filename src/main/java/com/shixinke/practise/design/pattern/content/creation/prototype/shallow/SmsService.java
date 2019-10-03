package com.shixinke.practise.design.pattern.content.creation.prototype.shallow;

import java.util.List;

/**
 * 发送短信服务
 * @author shixinke
 */
public class SmsService {

    /**
     * 批量发送短信
     * @param userList
     * @param sms
     */
    public void send(List<User> userList, Sms sms) {
        for (User user : userList) {
            Sms temp = (Sms)sms.clone();
            if (temp != null) {
                temp.setReceiver(user.getMobile());
                temp.setId(sms.getId() + user.getUserId());
                temp.setMessage(String.format(temp.getTemplate(), user.getNickname()));
                System.out.println("发送短信:" + temp);
            }
        }
        System.out.println("原始短信对象:" + sms);
    }
}
