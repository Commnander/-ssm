package com.itheima.cglib;



import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.itheima.aspect.MyAspect;

//代理类

public class CglibProxy implements MethodInterceptor {

	/* 参数说明 
	 *arg0 cglib根据父类生成的代理对象
	 *arg1 拦截方法
	 *arg2 拦截的方法的参数数组
	 *arg3 方法的代理对象，执行父类方法
	 * */
	
	public Object createProxy(Object target) {
		//创建一个动态对象
		Enhancer enhancer=new Enhancer();
		//确定需要增强的类，设置父类
		enhancer.setSuperclass(target.getClass());
		//添加回调函数
		enhancer.setCallback(this);
		return enhancer.create();
		
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		
		//创建切面对象
		MyAspect myAspect=new MyAspect();
		//前增强
		myAspect.check_Permission();
		//目标方法执行
		Object  object=arg3.invokeSuper(arg0, arg2);
		//后增强
		myAspect.log();
		return object;
	}

}
