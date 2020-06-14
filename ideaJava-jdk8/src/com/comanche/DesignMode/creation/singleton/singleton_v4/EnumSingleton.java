package com.comanche.DesignMode.creation.singleton.singleton_v4;

// 枚举单例
public enum EnumSingleton {
    INSTANCE;

    // 添加单例方法
    public void method() {
        System.out.println("Singleton method called...");
    }
}
