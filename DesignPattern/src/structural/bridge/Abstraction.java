package structural.bridge;

public abstract class Abstraction {
	private Implementor imp;

	public Abstraction(Implementor imp) {
		this.imp = imp;
	}

	public Implementor getImp() {
		return imp;
	}

	// 自身的行为和属性
	public void request() {
		this.imp.doSomething();
	}
}
