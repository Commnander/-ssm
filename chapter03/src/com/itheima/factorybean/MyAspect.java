
package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//������
public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		
		//ǰ��ǿ
		check_permission();
		//ִ��Ŀ�귽��
		Object object=arg0.proceed();
		//����ǿ
		log();
	
		return object;
	}

	public void check_permission() {
		// TODO Auto-generated method stub
		
		System.out.println("ģ����Ȩ��");
	}
	public void log() {
		// TODO Auto-generated method stub
		
		System.out.println("ģ����־");
	}
}
