package creational.factorymethod;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 //客户要产品A
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.Manufacture().Show();
 
        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.Manufacture().Show();
	}

}
