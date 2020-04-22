package structural.flyweight;

public class ConcreteFlyweight extends Flyweight{

	public ConcreteFlyweight(String extrinsic) {
		super(extrinsic);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void operate(int extrinsic) {
		// TODO 自动生成的方法存根
		System.out.println("具体Flyweight:" + extrinsic);
	}
	
	

}
