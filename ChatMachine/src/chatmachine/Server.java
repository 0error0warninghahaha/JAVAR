package chatmachine;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		ServerSocket server=new ServerSocket(8889);
		while(true) {
			Socket socket=server.accept();
			SocketHandler handler = new SocketHandler(socket);
			Thread thread=new Thread(handler);
			thread.start();
		}
	}

}
