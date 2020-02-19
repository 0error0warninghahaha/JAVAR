package factory;

import build.AsusDesktopComputerBuilder;
import build.AsusLaptopComputerBuilder;
import build.Director;
import computer.Computer;

public class AsusFactory implements Factory{

	@Override
	public Computer createDesktopComputer() {
		// TODO 自动生成的方法存根
		Director director = new Director();
		Computer computer = director.Construct(new AsusDesktopComputerBuilder());
		return computer;
	}

	@Override
	public Computer createLaptopComputer() {
		// TODO 自动生成的方法存根
		Director director = new Director();
		Computer computer = director.Construct(new AsusLaptopComputerBuilder());
		return computer;
	}

}
