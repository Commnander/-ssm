
package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//切面类
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		
		//前增强
		check_permission();
		//执行目标方法
		Object object=arg0.proceed();
		//后增强
		log();
	
		return object;
	}

	public void check_permission() {
		// TODO Auto-generated method stub
		
		System.out.println("模拟检查权限");
	}
	public void log() {
		// TODO Auto-generated method stub
		
		System.out.println("模拟日志");
	}
}
