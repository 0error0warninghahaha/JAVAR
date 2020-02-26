package computer;

import adapter.ComputerPower;
import adapter.PowerAdapter;

/*
 * 华硕笔记本
 */
public class AsusLaptopComputer implements Computer,ComputerPower,Cloneable{

	private String CPU;
	private String Memory;
	private String Disk;
	
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		System.out.println("正在组装华硕笔记本CPU");
		CPU = cPU;
	}
	public String getMemory() {
		return Memory;
	}
	public void setMemory(String memory) {
		System.out.println("正在组装华硕笔记本内存");
		Memory = memory;
	}
	public String getDisk() {
		return Disk;
	}
	public void setDisk(String disk) {
		System.out.println("正在组装华硕笔记本磁盘");
		Disk = disk;
	}
	@Override
	public String toString() {
		return "AsusLaptopComputer [CPU=" + CPU + ", Memory=" + Memory + ", Disk=" + Disk + "]";
	}
	@Override
	public AsusLaptopComputer clone() throws CloneNotSupportedException {
		// TODO 自动生成的方法存根
		return (AsusLaptopComputer)super.clone();
	}
	@Override
	public PowerAdapter getAdapter() {
		// TODO 自动生成的方法存根
		return new PowerAdapter();
	}
}
