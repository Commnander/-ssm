package com.itheima.jdk;


//jdk��̬�������
public class JdkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������
		JdkProxy jdkProxy=new JdkProxy();
		//����Ŀ�����
		UserDao userDao=new UserDaoImpl();
		//�Ӵ�������л�ȡ��ǿ���Ŀ�����
		UserDao useaoDao1=(UserDao)jdkProxy.creatProxy(userDao);
		useaoDao1.addUser();
		useaoDao1.deleteUser();
	}

}
