package chatmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO 自动生成的方法存根
		Scanner input= new Scanner(System.in);
		input.useDelimiter("\n");
		Socket socket = new Socket("127.0.0.1",8889);
		
		InputStreamReader reader = new InputStreamReader(socket.getInputStream());
		BufferedReader buffer_reader = new BufferedReader(reader);
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		boolean a=true;
		while(a) {	
		String readline=input.next();
		writer.println(readline);
		writer.flush();	
		String response = buffer_reader.readLine();
		System.out.println("Server say:"+ response);
		}
		writer.close(); 
		buffer_reader.close(); 
		socket.close(); 
	}

}
