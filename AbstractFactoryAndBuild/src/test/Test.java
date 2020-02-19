package test;

import computer.AsusDesktopComputer;
import computer.AsusLaptopComputer;
import computer.HaseeDesktopComputer;
import computer.HaseeLaptopComputer;
import factory.AsusFactory;
import factory.HaseeFactory;

public class Test {

	public static void main(String[] args) {
		//创建华硕台式机
		AsusDesktopComputer asusDesktopComputer =(AsusDesktopComputer) new AsusFactory().createDesktopComputer();
		//创建华硕笔记本
		AsusLaptopComputer asusLaptopComputer =(AsusLaptopComputer) new AsusFactory().createLaptopComputer();
		//创建神舟台式机
		HaseeDesktopComputer haseeDesktopComputer =(HaseeDesktopComputer) new HaseeFactory().createDesktopComputer();
		//创建神舟笔记本
		HaseeLaptopComputer haseeLaptopComputer =(HaseeLaptopComputer) new HaseeFactory().createLaptopComputer();
		
		System.out.println(asusDesktopComputer);
		System.out.println(asusLaptopComputer);
		System.out.println(haseeDesktopComputer);
		System.out.println(haseeLaptopComputer);
	}
}
