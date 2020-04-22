package creational.abstractfactory;

public class MediaFactory implements Factory{

	@Override
	public Fridge createFridge() {
		// TODO 自动生成的方法存根
		return new MediaFridge();
	}

	@Override
	public AirConditioner createAirConditioner() {
		// TODO 自动生成的方法存根
		return new MediaAirConditioner();
	}

	@Override
	public FengSan createFengSan() {
		// TODO 自动生成的方法存根
		return new MediaFengSan();
	}
	

}
