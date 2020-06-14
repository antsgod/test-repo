package com.comanche.DesignMode.creation.singleton.singleton_v3;

// 比尔.普夫单例
public class BillPughSingleton {
	// 私有构造函数，避免被客户端代码使用
	private BillPughSingleton() {}

	private static class LazyHolder {//增加助手类
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
