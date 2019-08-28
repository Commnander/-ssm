package com.itheima.cglib;



import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.itheima.aspect.MyAspect;

//������

public class CglibProxy implements MethodInterceptor {

	/* ����˵�� 
	 *arg0 cglib���ݸ������ɵĴ������
	 *arg1 ���ط���
	 *arg2 ���صķ����Ĳ�������
	 *arg3 �����Ĵ������ִ�и��෽��
	 * */
	
	public Object createProxy(Object target) {
		//����һ����̬����
		Enhancer enhancer=new Enhancer();
		//ȷ����Ҫ��ǿ���࣬���ø���
		enhancer.setSuperclass(target.getClass());
		//��ӻص�����
		enhancer.setCallback(this);
		return enhancer.create();
		
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		
		//�����������
		MyAspect myAspect=new MyAspect();
		//ǰ��ǿ
		myAspect.check_Permission();
		//Ŀ�귽��ִ��
		Object  object=arg3.invokeSuper(arg0, arg2);
		//����ǿ
		myAspect.log();
		return object;
	}

}
