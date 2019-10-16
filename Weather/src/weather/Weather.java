package weather;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import net.sf.json.xml.XMLSerializer;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.xml.util.PrettyXMLEventWriter;

public class Weather {
		
	//private static Logger log = Logger.getLogger(Weather.class);
 
	public static void main(String[] args) throws Exception {
		getWeatherByHttp("深圳");
		//getWeatherByHttp("上海");		
	}
 
	// 获取天气预报
	public static float getWeatherByHttp(String city) {
		String url = "http://wthrcdn.etouch.cn/weather_mini?";
		ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("city", city));
		String param = URLEncodedUtils.format(params, "utf-8");
		HttpGet httpGet = new HttpGet(url + param);
		HttpClient httpClient = new DefaultHttpClient();
 
		HttpResponse httpResponse = null;
		float low = 0;
		try {
			httpResponse = httpClient.execute(httpGet);
			//System.out.println(httpResponse);
			String result = getJsonStringFromGZIP(httpResponse);// 获取到解压缩之后的字符串
			//System.out.println(result);
			String xml=json2xml(result);
			xml2json(xml);
			// 输出
//			JSONObject jsonObject = JSONObject.fromObject(result);
//			String xmlStr = JsonUtils.json2xml(jsonObj);
//			xmlStr = "<xml>" + xmlStr + "</xml>";
//			System.out.println(xmlStr);
//			JSONObject jsonData = jsonObject.getJSONObject("data");
//			String forecast = jsonData.getString("forecast");
//			JSONArray array = JSONArray.fromObject(forecast);
//			String json = array.getString(0);
//			JSONObject Object = JSONObject.fromObject(json);
// 
//			String Slow = Object.getString("low");
//			low = NumberUtils.toFloat(Slow.substring(2, Slow.length() - 1).trim(), 0);// 最低温
			// String Shigh = Object.getString("high");// float
			// high=NumberUtils.toFloat(Shigh.substring(2,Shigh.length()-1).trim(), 0);//最高温
		} catch (Exception e) {
			//log.error(e);
			e.printStackTrace();
		}
		return low;
	}
 
	private static String getJsonStringFromGZIP(HttpResponse response) {
		String jsonString = null;
		try {
			InputStream is = response.getEntity().getContent();
			BufferedInputStream bis = new BufferedInputStream(is);
			bis.mark(2);
			// 取前两个字节
			byte[] header = new byte[2];
			int result = bis.read(header);
			// reset输入流到开始位置
			bis.reset();
			// 判断是否是GZIP格式
			int headerData = getShort(header);
			if (result != -1 && headerData == 0x1f8b) {
				is = new GZIPInputStream(bis);
			} else {
				is = bis;
			}
			InputStreamReader reader = new InputStreamReader(is, "utf-8");
			char[] data = new char[100];
			int readSize;
			StringBuffer sb = new StringBuffer();
			while ((readSize = reader.read(data)) > 0) {
				sb.append(data, 0, readSize);
			}
			jsonString = sb.toString();
			bis.close();
			reader.close();
		} catch (Exception e) {
			//log.error(e);
			e.printStackTrace();
		}
		return jsonString;
	}
 
	private static int getShort(byte[] data) {
		return (int) ((data[0] << 8) | data[1] & 0xFF);
	}

	public static String json2xml(String json) {
		StringReader input = new StringReader(json);
		StringWriter output = new StringWriter();
		JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
		try {
			XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
			XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
			writer = new PrettyXMLEventWriter(writer);
			writer.add(reader);
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (output.toString().length() >= 38) { //remove <?xml version="1.0" encoding="UTF-8"?>
			System.out.println(output.toString().substring(39));
			return output.toString().substring(39);
		}
		return output.toString();
	}
	
	public static String xml2json(String xml) {
		//创建XMLSerializer对象
		XMLSerializer xmlSerializer = new XMLSerializer();
		//将xml转化为json
		String result = xmlSerializer.read(xml).toString();
		//System.out.println(result);
		return result;
	}


}
