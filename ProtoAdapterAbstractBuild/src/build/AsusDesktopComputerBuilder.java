package build;

import computer.AsusDesktopComputer;
import computer.Computer;

public class AsusDesktopComputerBuilder implements BuildComputer{

	private AsusDesktopComputer computer;
	
	public AsusDesktopComputerBuilder() {
		computer = new AsusDesktopComputer();
	}
	
	@Override
	public void buildCPU() {
		// TODO 自动生成的方法存根
		computer.setCPU("华硕台式CPU");
	}

	@Override
	public void buildMemory() {
		// TODO 自动生成的方法存根
		computer.setMemory("华硕台式内存");
	}

	@Override
	public void buildDisk() {
		// TODO 自动生成的方法存根
		computer.setDisk("华硕台式磁盘");
	}

	@Override
	public Computer createComputer() {
		// TODO 自动生成的方法存根
		return computer;
	}

}
