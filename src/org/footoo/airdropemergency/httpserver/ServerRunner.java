package org.footoo.airdropemergency.httpserver;

import java.io.IOException;

public class ServerRunner {
	private static SimpleFileServer server;
	public static boolean serverIsRunning = false;

	/**
	 * ��ָ���˿�����server
	 * 
	 * @param port
	 */
	public static void startServer(int port) {
		server = SimpleFileServerFactory.getInstance(port);
		try {
			if (!serverIsRunning) {
				server.start();
				serverIsRunning = true;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �رշ�����
	 */
	public static void stopServer() {
		if (server != null) {
			server.stop();
			serverIsRunning = false;
		}
	}
}