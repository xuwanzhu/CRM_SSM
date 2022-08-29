package com.qidi.crm_ssm.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidi.crm_ssm.bean.CstCustomer;
import com.qidi.crm_ssm.service.CstCustomerService;

@Controller
@RequestMapping("cust")
public class CstCustomerController {
	
	@Resource(name="cstCustomerService")
	private CstCustomerService cstCustomerService;
	
	//��ȡ�����û�
	@RequestMapping("getAll.do")
	public String getAll(Model model) {
		List<CstCustomer> custs = cstCustomerService.getAll();
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
	}
	
	//�����ͻ�
	@RequestMapping("addCust.do")
	public String addCust(CstCustomer cstCustomer,Model model) {   //cstCustomer Ϊǰ̨�����ģ���modelΪspringmvc������ǰ̨��ֵ��
		cstCustomerService.addCust(cstCustomer);
		List<CstCustomer> custs = cstCustomerService.getAll();
		
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
		
		/*   model.addattribute()������
			 ��ǰ̨�����ݣ����Դ����󣬿��Դ�List��ͨ��el���ʽ ${}���Ի�ȡ��
			 
			 addAttribute() ������ SimpleXML Ԫ�����һ�����ԡ�

			�﷨
			
			addAttribute(name,value,ns);
			
			name:
			���衣
			�涨Ҫ��ӵ����Ե����ơ�
			
			value:
			��ѡ��
			�涨���Ե�ֵ��
			
			ns:
			��ѡ��
			�涨���Ե������ռ䡣
		 * */
	}
	
	//ɾ���û�
	@RequestMapping("deleteCust.do")
	public String deleteCust(int cust_id,Model model) {
		cstCustomerService.deleteCust(cust_id);
		List<CstCustomer> custs = cstCustomerService.getAll();
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
	}
	
	//ģ����ѯ
	//�����û������в�ѯ
	@RequestMapping("queryCust.do")
	public String queryCust(String cust_name,Model model) {
		List<CstCustomer> cc = cstCustomerService.queryCust("%"+cust_name+"%");
		model.addAttribute("list", cc);
		return "/jsp/customer/list.jsp";
	}
	
	//ͨ�����ֻ�ȡ�ͻ���Ϣ���ݵ�����ҳ����
	@RequestMapping("getCust.do")
	public String getCust(String cust_name,Model model) {
		List<CstCustomer> cc = cstCustomerService.queryCust("%"+cust_name+"%");
		model.addAttribute("list", cc);
		return "/jsp/customer/edit.jsp";
	}
	
	//�����û�
	@RequestMapping("updateCust.do")
	public String updateCust(CstCustomer cstCustomer,Model model) {
		cstCustomerService.updateCust(cstCustomer);
		List<CstCustomer> custs = cstCustomerService.getAll();
		model.addAttribute("list", custs);
		return "/jsp/customer/list.jsp";
	}
	
	//�ۺϲ�ѯ
	@RequestMapping("customer.do")
	public String queryAllCust(Model model) {
		List<CstCustomer> list = cstCustomerService.queryAllCust();
		model.addAttribute("list", list);
		return "/jsp/comprehensive/customer.jsp";
	}
	
	//�ۺϲ�ѯ-ģ����ѯ
	@RequestMapping("queryCustomer.do")
	public String queryCustomer(String cust_name,Model model) {
		List<CstCustomer> cc = cstCustomerService.queryCustomer("%"+cust_name+"%");
		model.addAttribute("list", cc);
		return "/jsp/comprehensive/customer.jsp";
	}
}
