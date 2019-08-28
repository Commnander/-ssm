package com.itheima.core.web.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.common.utils.Page;
import com.itheima.core.po.BaseDict;
import com.itheima.core.po.Customer;
import com.itheima.core.po.User;
import com.itheima.core.service.BaseDictService;
import com.itheima.core.service.CustomerService;

@Controller
public class CustomerController {
	
	// ����ע��
		@Autowired
		private CustomerService customerService;
		@Autowired
		private BaseDictService baseDictService;
		// �ͻ���Դ
		@Value("${customer.from.type}")
		private String FROM_TYPE;
		// �ͻ�������ҵ
		@Value("${customer.industry.type}")
		private String INDUSTRY_TYPE;
		// �ͻ�����
		@Value("${customer.level.type}")
		private String LEVEL_TYPE;
		/**
		 *  �ͻ��б�
		 */
		@RequestMapping(value = "/customer/list.action")
		public String list(@RequestParam(defaultValue="1")Integer page,
				@RequestParam(defaultValue="10")Integer rows, 
				String custName, String custSource, String custIndustry,
				String custLevel, Model model) {
			// ������ѯ���пͻ�
			Page<Customer> customers = customerService
					.findCustomerList(page, rows, custName, 
	                                        custSource, custIndustry,custLevel);
			model.addAttribute("page", customers);
			// �ͻ���Դ
			List<BaseDict> fromType = baseDictService
					.findBaseDictByTypeCode(FROM_TYPE);
			// �ͻ�������ҵ
			List<BaseDict> industryType = baseDictService
					.findBaseDictByTypeCode(INDUSTRY_TYPE);
			// �ͻ�����
			List<BaseDict> levelType = baseDictService
					.findBaseDictByTypeCode(LEVEL_TYPE);
			// ��Ӳ���
			model.addAttribute("fromType", fromType);
			model.addAttribute("industryType", industryType);
			model.addAttribute("levelType", levelType);
			model.addAttribute("custName", custName);
			model.addAttribute("custSource", custSource);
			model.addAttribute("custIndustry", custIndustry);
			model.addAttribute("custLevel", custLevel);
			return "customer";
		}
		//�����û�
		@RequestMapping("/customer/create.action")
		@ResponseBody
		public String customerCreate(Customer customer,HttpSession session) {
			//��ȡsession�е�ǰ�û�����Ϣ
			User user= (User)session.getAttribute("USER_SESSION");
			//����ǰ�û�id�洢�ͻ�������
			customer.setCust_create_id(user.getUser_id());
			Date date=new Date();
			//�õ�һ��timestamp���󣬴���mysql��ʱ���ʽΪyyyy/mm/dd hh:mm:ss
			Timestamp timestamp=new Timestamp(date.getTime());
			customer.setCust_createtime(timestamp);
			//ִ��service�д����ķ���
			int rows=customerService.createCustomer(customer);
			if(rows>0) {
				return "OK";
			}else {
				return "FAIL";
			}
		}
		
		
		//ͨ��id�õ�customer
		@RequestMapping("/customer/getCustomerById.action")
		@ResponseBody
		public Customer getCustomerById(Integer id) {
		Customer customer=customerService.getCustomerById(id);
			return customer;
		}
		//��������
		@RequestMapping("/customer/update.action")
		@ResponseBody
		public String customerUpdate(Customer customer) {
			int rows=customerService.updateCustomer(customer);
			if(rows>0) {
				return "OK";
			}else {
				return "FAIL";
			}
			
		}
		@RequestMapping("/customer/delete.action")
		public String customerDelete(Integer id) {
		    int rows = customerService.deleteCustomer(id);
		    if(rows > 0){			
		        return "OK";
		    }else{
		        return "FAIL";			
		    }
		}
	}

