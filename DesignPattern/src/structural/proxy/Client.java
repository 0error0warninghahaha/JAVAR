package structural.proxy;

public class Client {
	public static void main(String[] args) {
		IDog dog = new GunDog();
		IDog proxy = (IDog) MyProxyFactory.getProxy(dog);
		proxy.run();
	}
}
