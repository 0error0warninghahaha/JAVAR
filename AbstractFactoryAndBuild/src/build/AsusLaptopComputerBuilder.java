package build;

import computer.AsusLaptopComputer;
import computer.Computer;

public class AsusLaptopComputerBuilder implements BuildComputer{

	private AsusLaptopComputer computer;
	
	public AsusLaptopComputerBuilder() {
		computer = new AsusLaptopComputer();
	}
	
	@Override
	public void buildCPU() {
		// TODO 自动生成的方法存根
		computer.setCPU("华硕笔记本CPU");
	}

	@Override
	public void buildMemory() {
		// TODO 自动生成的方法存根
		computer.setMemory("华硕笔记本内存");
	}

	@Override
	public void buildDisk() {
		// TODO 自动生成的方法存根
		computer.setDisk("华硕笔记本磁盘");
	}

	@Override
	public Computer createComputer() {
		// TODO 自动生成的方法存根
		return computer;
	}

}
