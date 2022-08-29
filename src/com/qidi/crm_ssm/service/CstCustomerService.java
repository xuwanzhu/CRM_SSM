package com.qidi.crm_ssm.service;

import java.util.List;

import com.qidi.crm_ssm.bean.CstCustomer;

public interface CstCustomerService {
	public List<CstCustomer> getAll();
	
	public void addCust(CstCustomer cstCustomer);
	
	public void deleteCust(int cust_id);
	
	//ģ����ѯ
	//�����û������в�ѯ
	public List<CstCustomer> queryCust(String cust_name);
	
	public void updateCust(CstCustomer cstCustomer);
	
	public List<CstCustomer> queryAllCust();
	
	public List<CstCustomer> queryCustomer(String cust_name);
	
	public CstCustomer getOne(int cust_id);
}
