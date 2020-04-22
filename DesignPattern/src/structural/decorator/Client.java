package structural.decorator;

public class Client {
	public static void main(String[] args) {
        //创建原始对象
        Component component = new ConcreteComponent();
        //第一次装饰
        component = new ConcreteDecoratorA(component);
        //第二次装饰
        component = new ConcreteDeconratorB(component);
        //两次装饰后的操作
        component.operate();
    }
	
}
