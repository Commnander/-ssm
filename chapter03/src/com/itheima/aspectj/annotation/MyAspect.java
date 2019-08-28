package com.itheima.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*�ڴ����д֪ͨ*/
@Aspect
@Component
public class MyAspect {
	
	@Pointcut("execution(* com.itheima.jdk.*.*(..))")
	private void myPointCut() {
		
	}
	
	 //ǰ��֪ͨ
	@Before("myPointCut()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ��ģ��ִ��Ȩ�޼��");
		System.out.println("Ŀ�����ǣ�"+joinPoint.getTarget());
		System.out.println("��֯����ǿ�����Ŀ�귽����"+joinPoint.getSignature().getName());
	}
	//����֪ͨ
	@AfterReturning("myPointCut()")
	public void myAfterReturn(JoinPoint joinPoint) {
		System.out.println("����֪ͨ��ģ����־");
		System.out.println("��֯����ǿ�����Ŀ�귽����"+joinPoint.getSignature().getName());
	}
	//����֪ͨ
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		//��ʼ
		System.out.println("���ƿ�ʼ��ִ��Ŀ��֮ǰ��ģ�⿪ʼ����");
		//ִ�е�ǰĿ�귽��
		Object object=proceedingJoinPoint.proceed();
		//����
		System.out.println("���ƽ�����ִ��Ŀ��֮��ģ����־");
		
		return object;
		
		
	}
	//�쳣֪ͨ
	@AfterThrowing(value = "myPointCut()",throwing="t")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable t) {
		
		System.out.println("������"+t.getMessage());
		
		
	}
	
	//����֪ͨ
	@After("myPointCut()")
	public void myAfter() {
		
		
		System.out.println("����֪ͨ��ģ���ͷ���Դ");
		
	}
}
