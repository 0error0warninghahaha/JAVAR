package serialize2;

import java.io.IOException;

public class SerializeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		Teacher teacher = new Teacher();
		SerializaeTool.serialize(teacher, "teacher");
		SerializaeTool.printFileInfo("teacher");
	}

}
