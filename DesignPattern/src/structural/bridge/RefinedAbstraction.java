package structural.bridge;

public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor imp) {
		super(imp);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void request() {
		// TODO 自动生成的方法存根
		super.request();
		super.getImp().doAnything();
	}

	
}
