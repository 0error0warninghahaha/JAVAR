package creational.singleton;
/*
 * 静态内部类
 */
public class InternalClass {
	private static class Singleton{
		private static final InternalClass instance = new InternalClass();
	}
	private InternalClass() {
		
	}
	public static final InternalClass getInstance() {
		return Singleton.instance;
	}
}
