package computer;

import adapter.ComputerPower;
import adapter.PowerAdapter;

/*
 * 神舟台式机
 */
public class HaseeDesktopComputer implements Computer,ComputerPower,Cloneable{

	private String CPU;
	private String Memory;
	private String Disk;
	
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		System.out.println("正在组装神舟台式机CPU");
		CPU = cPU;
	}
	public String getMemory() {
		return Memory;
	}
	public void setMemory(String memory) {
		System.out.println("正在组装神舟台式机内存");
		Memory = memory;
	}
	public String getDisk() {
		return Disk;
	}
	public void setDisk(String disk) {
		System.out.println("正在组装神舟台式机磁盘");
		Disk = disk;
	}
	@Override
	public String toString() {
		return "HaseeDesktopComputer [CPU=" + CPU + ", Memory=" + Memory + ", Disk=" + Disk + "]";
	}
	@Override
	public HaseeDesktopComputer clone() throws CloneNotSupportedException {
		// TODO 自动生成的方法存根
		return (HaseeDesktopComputer)super.clone();
	}
	@Override
	public PowerAdapter getAdapter() {
		// TODO 自动生成的方法存根
		return new PowerAdapter();
	}
}
