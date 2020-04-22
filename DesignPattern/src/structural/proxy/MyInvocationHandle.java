package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler{
	private Object target;
	public void setTarget(Object target) {
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO 自动生成的方法存根
		DogUtils.method1();
        method.invoke(target, args);
        DogUtils.method2();
        return null;
	}

}
