package com.shixinke.practise.design.pattern.temp;

/**
 * finally测试
 * @author shixinke
 */
public class FinallyTest {

    public static int test() {
        int a = 10;
        try {
            return a;
        } catch (Exception ex) {
            return 0;
        } finally {
            System.out.println("after return");
        }
    }

    public static void main(String[] args) {
        int a = test();
        System.out.println(a);
    }
}
