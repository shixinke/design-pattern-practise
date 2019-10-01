package com.shixinke.practise.design.pattern.content.creation.factory.simplefactory.source;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

/**
 * 简单工厂源码测试
 * @author shixinke
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        try {
            Cipher cp = Cipher.getInstance("DESede");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }
}
