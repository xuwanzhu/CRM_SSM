package com.qidi.crm_ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qidi.crm_ssm.bean.SysUser;
import com.qidi.crm_ssm.dao.SysUserDao;
import com.qidi.crm_ssm.service.SysUserService;

@Service("sysUserService")
public class SysUserServiceImple implements SysUserService{

	@Resource(name = "sysUserDao")
	private SysUserDao sysUserDao;
	
	@Override
	public String login(String userCode, String password) {
		// TODO Auto-generated method stub
		SysUser user = sysUserDao.getByCode(userCode);
		//��ѯ���û� ���û�������ȷ
		if(user != null) {
			if(password.equals(user.getUser_password())) {
				return user.getUser_name();
			}
		}
		return null;
	}

	@Override
	public List<SysUser> getAll() {
		// TODO Auto-generated method stub
		return sysUserDao.getAll();
	}

	//�����û�
	@Override
	public SysUser getOne(int user_id) {
		// TODO Auto-generated method stub
		return sysUserDao.getOne(user_id);
	}

	//����
	@Override
	public void updateUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		sysUserDao.updateUser(sysUser);
	}

	//ģ����ѯ
	@Override
	public List<SysUser> queryLike(String user_name) {
		// TODO Auto-generated method stub
		return sysUserDao.queryLike(user_name);
	}

	//ɾ���û�
	@Override
	public void deleteUser(int user_id) {
		// TODO Auto-generated method stub
		sysUserDao.deleteUser(user_id);
	}

	//�����û�
	@Override
	public void addUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		sysUserDao.addUser(sysUser);
	}

	//ע��
	@Override
	public String register(String userCode, String password) {
		SysUser user = sysUserDao.getByCode(userCode); //�ж��û��Ƿ���ע���
		String userName = userCode;
		if(user == null) { //û����ע���
			
			//���û���ӵ����ݿ�
			sysUserDao.addSySUser(userCode,password,userName,"0");
			
			System.out.println("userCode:"+userCode+"password:"+password+"userName:"+userName);
			//��ӳɹ�
			return userName;
						
		}
		return null;
	}
	
}
