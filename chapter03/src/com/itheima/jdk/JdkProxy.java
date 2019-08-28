package com.itheima.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.itheima.aspect.MyAspect;

public class JdkProxy implements InvocationHandler {
	
	/* ����Ŀ����ӿ� */
	private UserDao userDao;
	
	
	/* ���������� */
	public Object creatProxy(UserDao userDao) {
		this.userDao=userDao;
		/* ������� */
		ClassLoader classLoader=JdkProxy.class.getClassLoader();
		//���������ʵ�ֵ����нӿ�
		Class<?>[] interfacesClasses=userDao.getClass().getInterfaces();
		//ʹ�ô����������ǿ�����ص��Ǵ����Ķ���
		return Proxy.newProxyInstance(classLoader, interfacesClasses, this);
	}
	
	/* ���ж�̬������ķ������ö�����invok�������� 
	 * arg0 �������Ķ���
	 * arg1 ��Ҫ��ִ�еķ�����Ϣ
	 * arg2 ִ�з�����Ҫ�Ĳ���
	 * */
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		
		//��������
		MyAspect myAspect=new MyAspect();
		//ǰ��ǿ
		myAspect.check_Permission();
		//��Ŀ�����ϵ��÷������������
		Object object=arg1.invoke(userDao, arg2);
		//����ǿ
		myAspect.log();
		return object;
	}

}
