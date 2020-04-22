package behavioral.visitor;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjectStructure objectStructure = new ObjectStructure();

		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());

		// 成功
		Success success = new Success();
		objectStructure.display(success);

		// 失败
		Failing failing = new Failing();
		objectStructure.display(failing);
	}

}
