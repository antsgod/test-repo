package com.comanche.DesignMode.creation.singleton.singleton_v2;

// 延迟初始化单例
public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(INSTANCE == null){//多线程下有问题
        	INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
