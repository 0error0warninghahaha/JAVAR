package build;

import computer.Computer;

public class Director {

	public Computer Construct(BuildComputer buildComputer) {
		buildComputer.buildCPU();
		buildComputer.buildMemory();
		buildComputer.buildDisk();
		return buildComputer.createComputer();
	}
}
