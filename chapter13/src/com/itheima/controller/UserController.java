package com.itheima.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itheima.po.User;
import com.itheima.po.UserVo;


/*HttpServletRequest request
HttpServletResponse response
HttpSession session
Model model
���԰�����
*/
@Controller
public class UserController {
	//Ĭ�ϰ�����
//	@RequestMapping("/selectUser")
//	public String selectUser(HttpServletRequest request) {
//		String id=request.getParameter("id");
//		System.out.println("id="+id);
//		return "success";
//		
//	}
	
	//���������Ͱ󶨣�String Integer Double��
	//@RequestParam(value = "user_id")���
	@RequestMapping("/selectUser")
	public String selectUser(@RequestParam(value = "user_id")Integer id) {
		
		System.out.println("id="+id);
		return "success";
		
	}
	
	//��ע��ҳ����ת
	@RequestMapping("toRegister")
	public String toRegister() {
		return "register";
	}
	
	//��pojo����
	@RequestMapping("/registerUser")
	public String segisterUser(User user) {
		String username=user.getUsername();
		String password=user.getPassword();
		System.out.println(username+"  "+password);
		return "success";
				
	}
	
	//���û��б���ת
	@RequestMapping("/toUser")
	public String toUser() {
		return "user";
	}
	//����ɾ����������
	@RequestMapping("/deleteUsers")
	public String deleteUsers(Integer[] ids) {
		if(ids!=null) {
			for (Integer id : ids) {
				System.out.println("ɾ����idΪ"+id+"�û�");
			}
			}else {
				System.out.println("û��ѡ��");
		}
		return "success";
		
	}
	
	//�û������޸�ҳ����ת
	@RequestMapping("/toUserEdit")
	public String toUserEdit() {
		return "user_edit";
	}
	
	//�����޸��û�
	@RequestMapping("/editUsers")
	public String editUsers(UserVo userVo) {
		List<User> users=userVo.getUsers();
		for (User user : users) {
			if(user.getId()!=null) {
				System.out.println("�޸���idΪ"+user.getId()+"�û���Ϊ��"+user.getUsername());
			}
		}
		return "success";
	}
}
