package computer;
/*
 * 华硕台式机
 */
public class AsusDesktopComputer implements Computer{

	private String CPU;
	private String Memory;
	private String Disk;
	
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		System.out.println("正在组装华硕台式机CPU");
		CPU = cPU;
	}
	public String getMemory() {
		return Memory;
	}
	public void setMemory(String memory) {
		System.out.println("正在组装华硕台式机内存");
		Memory = memory;
	}
	public String getDisk() {
		return Disk;
	}
	public void setDisk(String disk) {
		System.out.println("正在组装华硕台式机磁盘");
		Disk = disk;
	}
	@Override
	public String toString() {
		return "AsusDesktopComputer [CPU=" + CPU + ", Memory=" + Memory + ", Disk=" + Disk + "]";
	}
	
}
