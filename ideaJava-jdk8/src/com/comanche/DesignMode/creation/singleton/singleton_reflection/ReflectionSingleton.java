package com.comanche.DesignMode.creation.singleton.singleton_reflection;

public class ReflectionSingleton {
	private static ReflectionSingleton INSTANCE;

    private ReflectionSingleton() {
    	//throw new InstantiationError("不能通过反射创建单例");//反制破坏单例的方法
    }

	public static synchronized ReflectionSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ReflectionSingleton();
		}
		return INSTANCE;
	}
}
