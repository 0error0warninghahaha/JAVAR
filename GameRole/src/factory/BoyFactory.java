package factory;

import role.Boy;
import role.Role;

public class BoyFactory implements Factory{

	@Override
	public Role getRole() {
		// TODO 自动生成的方法存根
		return new Boy();
	}
	
}
