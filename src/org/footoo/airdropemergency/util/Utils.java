package org.footoo.airdropemergency.util;

import java.io.File;
import java.util.ArrayList;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

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

	/**
	 * ��һ���ļ�����ת����ArrayList
	 * 
	 * @param fileArray
	 * @return
	 */
	public static ArrayList<File> toArrayList(File[] fileArray) {
		ArrayList<File> list = new ArrayList<File>();
		for (File f : fileArray) {
			list.add(f);
		}
		return list;
	}

	/**
	 * �ж�wifi�Ƿ�����
	 * 
	 * @param info
	 * @return
	 */
	public static boolean isWifiConnected(WifiManager wifiManager,
			WifiInfo wifiInfo) {
		int ipAddress = wifiInfo == null ? 0 : wifiInfo.getIpAddress();
		return wifiManager.isWifiEnabled() && ipAddress != 0;
	}
}
