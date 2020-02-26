package factory;

import build.Director;
import build.HaseeDesktopComputerBuilder;
import build.HaseeLaptopComputerBuilder;
import computer.Computer;

public class HaseeFactory implements Factory{

	@Override
	public Computer createDesktopComputer() {
		// TODO 自动生成的方法存根
		Director director = new Director();
		Computer computer = director.Construct(new HaseeDesktopComputerBuilder());
		return computer;
	}

	@Override
	public Computer createLaptopComputer() {
		// TODO 自动生成的方法存根
		Director director = new Director();
		Computer computer = director.Construct(new HaseeLaptopComputerBuilder());
		return computer;
	}

}