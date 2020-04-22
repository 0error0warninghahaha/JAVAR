package creational.singleton;
/*
 * 双重锁
 */
public class DoubleLock {
	private static DoubleLock instance;
	private DoubleLock() {
		
	}
	public static DoubleLock getInstance() {
		if(instance==null) {
			synchronized (DoubleLock.class) {
				if(instance==null) {
					instance = new DoubleLock(); 
				}
			}
		}
		return instance;
	}
}
