package build;

import computer.Computer;

public interface BuildComputer {

	//装CPU
	public void buildCPU();
	//装内存
	public void buildMemory();
	//装磁盘
	public void buildDisk();
	//返回组装好的电脑
	public Computer createComputer();
}
