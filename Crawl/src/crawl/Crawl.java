package crawl;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.*;

public class Crawl {
	
	public static void main(String args[]) throws IOException {
		String buf = getBuf();
		 System.out.println(buf);
		getregex(buf);
	}
	
	public static String getBuf() {
		try {
			URL url = new URL("https://www.w3.org/Consortium/Member/List");
			BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			StringBuffer strbuf=new StringBuffer();
			String str=null;
			while((str=reader.readLine())!=null) {
				strbuf.append(str);						
			}
			return strbuf.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void getregex(String s) throws IOException {
		Pattern p=Pattern.compile("class=\"member\">(\\D.+?)</a>");
		Matcher m = p.matcher(s);
		FileWriter fwriter = new FileWriter("D:\\crawl.txt");
		while(m.find()) {
			fwriter.write(m.group(1));
			fwriter.append("\r\n");
		}
		fwriter.flush();
		fwriter.close();
	}
}