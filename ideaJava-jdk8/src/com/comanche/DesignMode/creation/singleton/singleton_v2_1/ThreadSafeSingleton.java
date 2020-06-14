package com.comanche.DesignMode.creation.singleton.singleton_v2_1;

// 线程安全单例
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton INSTANCE;

    // 私有构造函数，避免被客户端代码使用
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {//多线程下的优化
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
