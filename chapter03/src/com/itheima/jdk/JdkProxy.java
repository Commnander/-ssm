package com.itheima.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.itheima.aspect.MyAspect;

public class JdkProxy implements InvocationHandler {
	
	/* 声明目标类接口 */
	private UserDao userDao;
	
	
	/* 创建代理方法 */
	public Object creatProxy(UserDao userDao) {
		this.userDao=userDao;
		/* 类加载器 */
		ClassLoader classLoader=JdkProxy.class.getClassLoader();
		//被代理对象实现的所有接口
		Class<?>[] interfacesClasses=userDao.getClass().getInterfaces();
		//使用代理类进行增强，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, interfacesClasses, this);
	}
	
	/* 所有动态代理类的方法调用都交由invok方法处理 
	 * arg0 被代理后的对象
	 * arg1 将要被执行的方法信息
	 * arg2 执行方法需要的参数
	 * */
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		
		//声明切面
		MyAspect myAspect=new MyAspect();
		//前增强
		myAspect.check_Permission();
		//在目标类上调用方法，传入参数
		Object object=arg1.invoke(userDao, arg2);
		//后增强
		myAspect.log();
		return object;
	}

}
