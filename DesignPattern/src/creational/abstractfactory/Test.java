package creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Factory factory=new MediaFactory();
		
		AirConditioner airConditioner=factory.createAirConditioner();
		FengSan fan=factory.createFengSan();
		Fridge fridge=factory.createFridge();
		
		airConditioner.airConditionerInfo();
		fan.fengsanInfo();
		fridge.fridgeInfo();
	}

}
