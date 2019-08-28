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

/*在此类编写通知*/
@Aspect
@Component
public class MyAspect {
	
	@Pointcut("execution(* com.itheima.jdk.*.*(..))")
	private void myPointCut() {
		
	}
	
	 //前置通知
	@Before("myPointCut()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知：模拟执行权限检查");
		System.out.println("目标类是："+joinPoint.getTarget());
		System.out.println("被织入增强处理的目标方法："+joinPoint.getSignature().getName());
	}
	//后置通知
	@AfterReturning("myPointCut()")
	public void myAfterReturn(JoinPoint joinPoint) {
		System.out.println("后置通知：模拟日志");
		System.out.println("被织入增强处理的目标方法："+joinPoint.getSignature().getName());
	}
	//环绕通知
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		//开始
		System.out.println("环绕开始，执行目标之前，模拟开始事务");
		//执行当前目标方法
		Object object=proceedingJoinPoint.proceed();
		//结束
		System.out.println("环绕结束，执行目标之后，模拟日志");
		
		return object;
		
		
	}
	//异常通知
	@AfterThrowing(value = "myPointCut()",throwing="t")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable t) {
		
		System.out.println("出错了"+t.getMessage());
		
		
	}
	
	//最终通知
	@After("myPointCut()")
	public void myAfter() {
		
		
		System.out.println("最终通知：模拟释放资源");
		
	}
}
