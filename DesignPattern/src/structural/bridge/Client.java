package structural.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Implementor imp = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imp);
		abs.request();
	}

}
