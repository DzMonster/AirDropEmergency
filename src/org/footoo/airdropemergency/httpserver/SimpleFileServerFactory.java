package org.footoo.airdropemergency.httpserver;

/**
 * ʵ��SimpleFileServer�ĵ���ģʽ
 * 
 * @author liushuai
 * 
 */
public class SimpleFileServerFactory {
	private static SimpleFileServer server;

	/**
	 * ��ȡһ��SimpleFileServer��ʵ��
	 * 
	 * @return
	 */
	public static SimpleFileServer getInstance(int port) {
		if (server == null) {
			server = new SimpleFileServer(port);
		}
		return server;
	}
}
