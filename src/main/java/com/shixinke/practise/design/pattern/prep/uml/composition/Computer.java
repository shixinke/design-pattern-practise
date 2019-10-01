package com.shixinke.practise.design.pattern.prep.uml.composition;

/**
 * 电脑(由CPU、硬盘、内存、主板等部件组成)
 * @author shixinke
 */
public class Computer {
    /**
     * CPU
     */
    private CPU cpu;
    /**
     * 硬盘
     */
    private Disk disk;
    /**
     * 内存
     */
    private Memory memory;
    /**
     * 主板
     */
    private MotherBoard motherBoard;
}
