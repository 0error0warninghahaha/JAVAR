package structural.adapter;
/*
 * 电脑电源接口
 */
public interface ComputerPower {
	//该方法返回适配器
	public PowerAdapter getAdapter();
}
