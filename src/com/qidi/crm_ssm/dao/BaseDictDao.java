package com.qidi.crm_ssm.dao;

import com.qidi.crm_ssm.bean.CstCustomer;

public interface BaseDictDao {
	//�����ͻ���Դ
	public void insertSource(CstCustomer cstCustomer);
	//�����ͻ���ҵ
	public void insertIndustry(CstCustomer cstCustomer);
	//�����ͻ�����
	public void insertLevel(CstCustomer cstCustomer);
}
