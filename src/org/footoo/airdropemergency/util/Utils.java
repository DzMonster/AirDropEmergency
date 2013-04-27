package org.footoo.airdropemergency.util;

public abstract class Utils {
	/**
	 * ��int�͵�IP��ַת��Ϊ�ɶ���ʮ����IP
	 * 
	 * @param ip
	 */
	public static String int2Ip(int ip) {
		return (ip & 0xFF) + "." + ((ip >> 8) & 0xFF) + "."
				+ ((ip >> 16) & 0xFF) + "." + ((ip >> 24) & 0xFF);
	}

	/**
	 * �ж�һ���ַ����Ƿ�Ϊ��
	 * 
	 * @param str
	 * @return
	 */
	public static boolean strIsEmpty(String str) {
		return str.equals("") || str == null;
	}
}
