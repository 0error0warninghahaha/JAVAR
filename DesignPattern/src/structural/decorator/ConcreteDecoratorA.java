package structural.decorator;

public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void operate() {
		// TODO 自动生成的方法存根
		super.operate();
		this.operateAMethod();
    }

    private void operateAMethod() {
        System.out.println("ConcreteDecoratorA添加的修饰方法");
    }

}
