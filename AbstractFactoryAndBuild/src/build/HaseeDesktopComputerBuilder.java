package build;

import computer.Computer;
import computer.HaseeDesktopComputer;

public class HaseeDesktopComputerBuilder implements BuildComputer{

	private HaseeDesktopComputer computer;
	
	public HaseeDesktopComputerBuilder() {
		computer = new HaseeDesktopComputer();
	}
	
	@Override
	public void buildCPU() {
		// TODO 自动生成的方法存根
		computer.setCPU("神舟台式CPU");
	}

	@Override
	public void buildMemory() {
		// TODO 自动生成的方法存根
		computer.setMemory("神舟台式内存");
	}

	@Override
	public void buildDisk() {
		// TODO 自动生成的方法存根
		computer.setDisk("神舟台式磁盘");
	}

	@Override
	public Computer createComputer() {
		// TODO 自动生成的方法存根
		return computer;
	}

}
