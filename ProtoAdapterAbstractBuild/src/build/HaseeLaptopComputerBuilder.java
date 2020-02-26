package build;

import computer.Computer;
import computer.HaseeLaptopComputer;

public class HaseeLaptopComputerBuilder implements BuildComputer{

	private HaseeLaptopComputer computer;
	
	public HaseeLaptopComputerBuilder() {
		computer = new HaseeLaptopComputer();
	}
	
	@Override
	public void buildCPU() {
		// TODO 自动生成的方法存根
		computer.setCPU("神舟笔记本CPU");
	}

	@Override
	public void buildMemory() {
		// TODO 自动生成的方法存根
		computer.setMemory("神舟笔记本内存");
	}

	@Override
	public void buildDisk() {
		// TODO 自动生成的方法存根
		computer.setDisk("神舟笔记本磁盘");
	}

	@Override
	public Computer createComputer() {
		// TODO 自动生成的方法存根
		return computer;
	}

}
