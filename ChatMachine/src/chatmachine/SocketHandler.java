package chatmachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketHandler implements Runnable{
	private Socket socket;
	public SocketHandler(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			InputStreamReader reader=new InputStreamReader(socket.getInputStream());
			BufferedReader bufferreader = new BufferedReader(reader);
			PrintWriter writer=new PrintWriter(socket.getOutputStream());
			String client = "<" + socket.getInetAddress().toString() + " : " + socket.getPort() + ">";
			boolean a=true;
			//while(a) {
				String request = bufferreader.readLine();
				System.out.println(client + " say:" + request);
				if(request.startsWith("<register name=xu/>")) {
					if(request.equals("<register name=xu/>ok")) writer.println("<result command=register state=ok/>");
					else  writer.println("<result command=register state=error message= />");
				}
				if(request.startsWith("<login name=xu/>")) {
					if(request.equals("<login name=xu/>ok")) writer.println("<result command=login state=ok/>");
					else  writer.println("<result command=login state=error message= />");
				}
				if(request.equals("<message from name=xu to=zhang message=this is a test/>")) {
					writer.println("<result command=message state=ok />");
				}
				if(request.startsWith("<logout name=xu/>")) {
					if(request.equals("<logout name=xu/>ok")) writer.println("<result command=logout state=ok/>");
					else  writer.println("<result command=logout state=error message= />");
				}
				writer.flush();
			//}
			writer.close();
			bufferreader.close();
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
