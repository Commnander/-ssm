package com.itheima.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
* @ClassName: MyAspect 
* @Description: �����࣬�ڴ����б�д֪ͨ
 */
public class MyAspect {
	
	/**
	* @Title: myBerore 
	* @Description: ǰ��֪ͨ
	* @Parameters: @param joinpoint
	* @Return void
	* @Throws
	 */
	public void myBefore(JoinPoint joinpoint) {
		System.out.println("ǰ��֪ͨ��ģ��ִ��Ȩ�޼�� ...��");
		System.out.println("Ŀ�����ǣ�" +joinpoint.getTarget());
		System.out.println(",��ֲ����ǿ�����Ŀ�귽��Ϊ��"+joinpoint.getSignature().getName());
	}
	
	/**
	* @Title: myAfterreturning 
	* @Description: ����֪ͨ
	* @Parameters: @param joinPoint
	* @Return void
	* @Throws
	 */
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("����֪ͨ��ģ�������־ . . . ,  ");
		System.out.println("��ֲ����ǿ�����Ŀ�귽��Ϊ�� " +joinPoint.getSignature().getName());
	}
	
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// ��ʼ
		System.out.println("���ƿ�ʼ��ִ��Ŀ�귽��֮ǰ��ģ�⿪������ . . .");
		//ִ�е�ǰĿ�귽��
		Object object = proceedingJoinPoint.proceed();
		//����
		System.out.println("���ƽ����� ִ��Ŀ�귽��֮��ģ��ر����� . . .");
		return object;
	}
	
	/**
	* @Title: myAfterThrowing 
	* @Description: �쳣֪ͨ
	* @Parameters: @param joinPoint
	* @Parameters: @param throwable
	* @Return void
	* @Throws
	 */
	public void myAfterThrowing(JoinPoint joinPoint, Throwable throwable) {
		System.out.println("�쳣֪ͨ�� " + "������" + throwable.getMessage());
	}
	
	/**
	* @Title: myAfter 
	* @Description: ����֪ͨ
	* @Parameters: 
	* @Return void
	* @Throws
	 */
	public void myAfter() {
		System.out.println("����֪ͨ�� ģ�ⷽ���������ͷ���Դ . . .");
	}
}
