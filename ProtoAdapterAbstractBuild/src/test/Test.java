package test;

import adapter.PowerAdapter;
import computer.AsusDesktopComputer;
import factory.AsusFactory;

/*
 * 	本例子直接在上次抽象工厂和建造者模式作业基础上进行改造
 *	 将220V交流电通过适配器转换为5V直流电
 *	原型模式例子即实现clone()方法
 */
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		//工厂和创建者模式创建华硕台式机
		AsusDesktopComputer asusDesktopComputer =(AsusDesktopComputer) new AsusFactory().createDesktopComputer();
		//获取电源适配器
		PowerAdapter adapter = asusDesktopComputer.getAdapter();
		//适配器输出5V直流电
		int dc5v = adapter.outputDC5V();
		System.out.println(dc5v);
		//复制一个电脑
		AsusDesktopComputer clone = asusDesktopComputer.clone();
		//输出false
		System.out.println(asusDesktopComputer==clone);
	}
}
