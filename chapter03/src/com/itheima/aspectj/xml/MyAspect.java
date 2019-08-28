package com.itheima.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
* @ClassName: MyAspect 
* @Description: 切面类，在此类中编写通知
 */
public class MyAspect {
	
	/**
	* @Title: myBerore 
	* @Description: 前置通知
	* @Parameters: @param joinpoint
	* @Return void
	* @Throws
	 */
	public void myBefore(JoinPoint joinpoint) {
		System.out.println("前置通知：模拟执行权限检查 ...，");
		System.out.println("目标类是：" +joinpoint.getTarget());
		System.out.println(",被植入增强处理的目标方法为："+joinpoint.getSignature().getName());
	}
	
	/**
	* @Title: myAfterreturning 
	* @Description: 后置通知
	* @Parameters: @param joinPoint
	* @Return void
	* @Throws
	 */
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("后置通知：模拟记入日志 . . . ,  ");
		System.out.println("被植入增强处理的目标方法为： " +joinPoint.getSignature().getName());
	}
	
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// 开始
		System.out.println("环绕开始：执行目标方法之前，模拟开启事务 . . .");
		//执行当前目标方法
		Object object = proceedingJoinPoint.proceed();
		//结束
		System.out.println("环绕结束： 执行目标方法之后，模拟关闭事务 . . .");
		return object;
	}
	
	/**
	* @Title: myAfterThrowing 
	* @Description: 异常通知
	* @Parameters: @param joinPoint
	* @Parameters: @param throwable
	* @Return void
	* @Throws
	 */
	public void myAfterThrowing(JoinPoint joinPoint, Throwable throwable) {
		System.out.println("异常通知： " + "出错了" + throwable.getMessage());
	}
	
	/**
	* @Title: myAfter 
	* @Description: 最终通知
	* @Parameters: 
	* @Return void
	* @Throws
	 */
	public void myAfter() {
		System.out.println("最终通知： 模拟方法结束后释放资源 . . .");
	}
}
