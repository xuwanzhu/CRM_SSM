package com.qidi.crm_ssm.service;

import java.util.List;

import com.qidi.crm_ssm.bean.CstLinkMan;

public interface CstLinkManService {
	//�ͻ���Ӧ����ϵ��
	public CstLinkMan getOne(int lkm_cust_id);
	//������ϵ��
	public List<CstLinkMan> getAll();
	//ģ����ѯ
	public List<CstLinkMan> getByLike(String lkm_name);
	//������ϵ��
	public void updateLink(CstLinkMan cstLinkMan);
	//������ϵ��
	public void addLink(CstLinkMan cstLinkMan);
	//ɾ����ϵ��
	public void deleteLink(int lkm_id);
	//�ۺϲ�ѯ
	public List<CstLinkMan> queryLink();
	//�ۺϲ�ѯ-ģ����ѯ
	public List<CstLinkMan> queryByLike(String lkm_name);
}
