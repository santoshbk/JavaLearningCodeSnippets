package com.design.singleton;

public class SingletonClass {

	private static SingletonClass instance;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		synchronized (SingletonClass.class) {
			if (null == instance) {
				instance = new SingletonClass();
			}
		}
		return instance;
	}

}