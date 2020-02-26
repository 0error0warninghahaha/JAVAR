package adapter;
/*
 * 这是电源适配器
 */
public class PowerAdapter {
	
	private ACPower acPower = new ACPower();
	
	/*
	 * 该方法将220V交流电转换为5直流电
	 */
	public int outputDC5V() {
		int ac220v = acPower.outputAC220V();
		int dc5v = ac220v/44;
		System.out.println("电源适配器：正将"+ac220v+"V交流电源转为"+dc5v+"直流电源");
		return dc5v;
	}

}
