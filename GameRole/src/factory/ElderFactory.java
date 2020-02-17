package factory;

import role.Elder;
import role.Role;

public class ElderFactory implements Factory{

	@Override
	public Role getRole() {
		// TODO 自动生成的方法存根
		return new Elder();
	}
	
}
