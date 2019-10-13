package serialize3;

import java.io.IOException;

public class SerializeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		Person person = new Person();
		SerializaeTool.serialize(person, "person");
		SerializaeTool.printFileInfo("Person");
		Object object = SerializaeTool.deSeeialize("Person");
		Person per=(Person) object;
		System.out.println("Person Name:"+per.getName());
	}

}
