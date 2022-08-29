package com.qidi.crm_ssm.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLFunctions
{
	/**
	 * ��ָ���ı��뷽ʽ���ַ������н���
	 * @param s��Ҫ������ַ���
	 * @param enc������ı��뷽ʽ���� utf-8
	 * @return �������ַ���
	 */
	public static String decode(String s, String enc)
	{
		try
		{
			return URLDecoder.decode(s, enc);
		} 
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * ��ָ���ı��뷽ʽ���ַ������б���
	 * @param s��Ҫ������ַ���
	 * @param enc������ı��뷽ʽ���� utf-8
	 * @return �������ַ���
	 */
	public static String encode(String s, String enc)
	{
		try
		{
			return URLEncoder.encode(s, enc);
		} 
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
	}
}