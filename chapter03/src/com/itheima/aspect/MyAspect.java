package com.itheima.aspect;


/*jdk代理
	切面类：可以存在多个通知Advice(增强的方法)*/
public class MyAspect {
	public void check_Permission() {
		System.out.println("模拟检查权限");
	}
	
	public void log() {
		System.out.println("模拟创建日志");
	}
}
