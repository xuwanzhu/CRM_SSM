package com.qidi.crm_ssm.dao;

import java.util.List;

import com.qidi.crm_ssm.bean.SysUser;

public interface SysUserDao {
	
	public SysUser getByCode(String userCode);
	
	public List<SysUser> getAll();
	
	public SysUser getOne(int user_id);
	
	public void updateUser(SysUser sysUser);
	
	public List<SysUser> queryLike(String user_name);
	
	public void deleteUser(int user_id);
	
	public void addUser(SysUser sysUser);

	//���û���ӵ����ݿ�
	public void addSySUser(String userCode, String password, String userName, String state);
}
