package com.sun.charpter1;

import java.io.Serializable;

public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();
    private  Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }


    //防止每次反序列化一个序列化的实例是，都会创建一个新的实例
    private Object readResolve() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {

    }
}
