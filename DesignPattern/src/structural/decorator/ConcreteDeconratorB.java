package structural.decorator;

public class ConcreteDeconratorB extends Decorator{

	public ConcreteDeconratorB(Component component) {
		super(component);
		// TODO 自动生成的构造函数存根
	}
	
	@Override
    public void operate() {
        //调用自己的方法
        this.operateBMethod();
        super.operate();
    }

    private void operateBMethod() {
        System.out.println("ConcreteDecoratorB添加的修饰方法");
    }

}
