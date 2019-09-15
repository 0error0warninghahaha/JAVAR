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
		// TODO �Զ����ɵķ������
		System.out.println("�ⷿ����...");
		Object obj=method.invoke(renter, args);
		System.out.println("�ⷿ��ɣ�");
		return obj;
	}

}
