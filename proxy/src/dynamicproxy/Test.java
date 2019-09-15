package dynamicproxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Rent renter=new Renter();
		Intermediary intermediary=new Intermediary(renter);
		Rent proxy=(Rent) Proxy.newProxyInstance(renter.getClass().getClassLoader(), 
				renter.getClass().getInterfaces(), intermediary);
		proxy.rent("²Ì¹â×Ú");
//		Rent rent= (Rent)Proxy.newProxyInstance(Rent.class.getClassLoader(),
//				new Class[] {Rent.class}, new Intermediary(renter));
//		rent.rent("²Ì¹â×Ú");
	}
}
