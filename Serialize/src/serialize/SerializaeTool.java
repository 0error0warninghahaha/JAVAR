package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializaeTool {
	
	public static void serialize(Object obj,String filename) throws IOException {
		File file=new File(filename);	//新建一个本地文件，用于存储，序列化对象字节流
		FileOutputStream output = new FileOutputStream(file);	//文件输出流
		ObjectOutputStream os = new ObjectOutputStream(output);	//对象输出流
		os.writeObject(obj);	//将对象写入对象输入流中
		os.flush();		//提交对象输入流
		os.close();
		output.close();
	}
	
	public static Object deSeeialize(String filename) throws IOException, ClassNotFoundException {
		File file = new File(filename);
		FileInputStream input = new FileInputStream(file);
		ObjectInputStream is = new ObjectInputStream(input);
		Object obj = is.readObject();	//从对象输入流中读取对象
		is.close();
		input.close();
		return obj;
	}
	
	public static void printFileInfo(String filename) {
		File file = new File(filename);
		System.out.println("文件名："+filename);	//打印文件名
		System.out.println("文件大小："+file.length()+"bytes");		//打印文件大小
	}
}
