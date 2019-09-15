package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Intermediary implements InvocationHandler{
	private Object renter;
	
	public Intermediary(Object renter) {
		this.renter=renter;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println("租房请求...");
		Object obj=method.invoke(renter, args);
		System.out.println("租房完成！");
		return obj;
	}

}
