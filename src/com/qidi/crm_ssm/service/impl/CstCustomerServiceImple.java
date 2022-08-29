package com.qidi.crm_ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qidi.crm_ssm.bean.CstCustomer;
import com.qidi.crm_ssm.bean.CstLinkMan;
import com.qidi.crm_ssm.dao.CstCustomerDao;
import com.qidi.crm_ssm.dao.CstLinkManDao;
import com.qidi.crm_ssm.service.CstCustomerService;

@Service("cstCustomerService")
public class CstCustomerServiceImple implements CstCustomerService {

	@Resource(name = "cstCustomerDao")
	private CstCustomerDao cstCustomerDao;
	
	@Resource(name = "cstLinkManDao")
	private CstLinkManDao cstLinkManDao;
	
	//��ѯ���й˿�
	@Override
	public List<CstCustomer> getAll() {
		// TODO Auto-generated method stub
		List<CstCustomer> list = cstCustomerDao.getAll();
		for(CstCustomer c:list) {
			CstLinkMan clm = cstLinkManDao.getOne(c.getCust_id());
			if(clm!=null) {
				c.setCstLinkMan(clm); 
			}
		}
		return list;
	}

	
	@Override
	public void addCust(CstCustomer cstCustomer) {
		// TODO Auto-generated method stub
		cstCustomerDao.addCust(cstCustomer);
	}


	@Override
	public void deleteCust(int cust_id) {
		// TODO Auto-generated method stub
		cstCustomerDao.deleteCust(cust_id);
	}

	//ģ����ѯ
	//�����û������в�ѯ
	@Override
	public List<CstCustomer> queryCust(String cust_name) {
		// TODO Auto-generated method stub
		List<CstCustomer> list = cstCustomerDao.queryCust(cust_name);
		for(CstCustomer c:list) {
			CstLinkMan clm = cstLinkManDao.getOne(c.getCust_id());
			if(clm!=null) {
				c.setCstLinkMan(clm); 
			}
		}
		return list;
	}

	//���¿ͻ�
	@Override
	public void updateCust(CstCustomer cstCustomer) {
		// TODO Auto-generated method stub
		cstCustomerDao.updateCust(cstCustomer);
	}

	//�ۺϲ�ѯ
	@Override
	public List<CstCustomer> queryAllCust() {
		// TODO Auto-generated method stub
		List<CstCustomer> list = cstCustomerDao.queryAllCust();
		for(CstCustomer c:list) {
			CstLinkMan clm = cstLinkManDao.getOne(c.getCust_id());
			if(clm!=null) {
				c.setCstLinkMan(clm); 
			}
		}
		return list;
	}

	//�ۺϲ�ѯ-ģ����ѯ

	@Override
	public List<CstCustomer> queryCustomer(String cust_name) {
		// TODO Auto-generated method stub
		List<CstCustomer> list = cstCustomerDao.queryCustomer(cust_name);
		for(CstCustomer c:list) {
			CstLinkMan clm = cstLinkManDao.getOne(c.getCust_id());
			if(clm!=null) {
				c.setCstLinkMan(clm); 
			}
		}
		return list;
	}

	//����id��ȡ�û�
	@Override
	public CstCustomer getOne(int cust_id) {
		// TODO Auto-generated method stub
		return cstCustomerDao.getOne(cust_id);
	}
	
}
