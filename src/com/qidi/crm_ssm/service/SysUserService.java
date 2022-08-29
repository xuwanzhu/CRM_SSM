package com.qidi.crm_ssm.service;

import java.util.List;

import com.qidi.crm_ssm.bean.SysUser;

public interface SysUserService {
	
	/*
	 * �û���¼
	 * */
	public String login(String userCode,String password);
	
	public List<SysUser> getAll();
	
	public SysUser getOne(int user_id);
	
	public void updateUser(SysUser sysUser);
	
	public List<SysUser> queryLike(String user_name);
	
	public void deleteUser(int user_id);
	
	public void addUser(SysUser sysUser);

	//ע��
	public String register(String userCode, String password);
}
