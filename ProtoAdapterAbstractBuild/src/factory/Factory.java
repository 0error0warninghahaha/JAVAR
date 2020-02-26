package factory;

import computer.Computer;
/*
 * 抽象工厂接口
 */
public interface Factory {
	public Computer createDesktopComputer();
	public Computer createLaptopComputer();
}
