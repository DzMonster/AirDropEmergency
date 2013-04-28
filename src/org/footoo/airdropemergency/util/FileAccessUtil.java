package org.footoo.airdropemergency.util;

import java.io.File;

import android.os.Environment;

public abstract class FileAccessUtil {
	/**
	 * �ж��Ƿ���SD��
	 * 
	 * @return
	 */
	public static boolean hasSdcard() {
		return Environment.MEDIA_MOUNTED.equals(Environment
				.getExternalStorageState());
	}

	/**
	 * �����ļ������ַ���һ�����ʵ������Ĵ洢·����SD�������ļ�ϵͳ��Ŀ¼��
	 * 
	 * @param dirName
	 * @return
	 */
	public static String getDirBasePath(String dirName) {
		if (FileAccessUtil.hasSdcard()) {
			return "/sdcard" + "/" + dirName;
		} else {
			return "/" + dirName;
		}
	}

	/**
	 * ��������Ϊdir��Ŀ¼
	 * 
	 * @param dir
	 * @return ����Ŀ¼������·��
	 */
	public static String createDir(String dir) {
		String fullPath = getDirBasePath(dir);
		File f = new File(fullPath);
		if (!f.exists()) {
			f.mkdir();
		}
		return fullPath;
	}

	/**
	 * ����·�������ļ�
	 * 
	 * @param fileFullPath
	 * @return
	 */
	public static File getFile(String fileFullPath) {
		File f = new File(fileFullPath);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (Exception e) {
				return null;
			}
		}
		return f;
	}

	/**
	 * ����FileName�ֶεõ��ļ�����
	 * 
	 * @param rawName
	 * @return
	 */
	public static String decodeFileName(String rawName) {
		String fileName = rawName;
		if (fileName.contains("\\")) {
			fileName = fileName.substring(fileName.lastIndexOf("\\"));
		}
		return fileName;
	}

	/**
	 * ����һ���ļ����µ������ļ�
	 * 
	 * @param dirPath
	 * @return
	 */
	public static File[] getFillList(String dirPath) {
		File file = new File(dirPath);
		return file.listFiles();
	}
}
