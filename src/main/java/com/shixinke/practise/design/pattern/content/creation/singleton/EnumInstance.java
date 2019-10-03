package com.shixinke.practise.design.pattern.content.creation.singleton;



public enum EnumInstance {
    INSTANCE;
    EnumInstance() {

    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
