package staticproxy;

public class Intermediary implements Rent{
	private Renter renter;
	
	public Intermediary(Renter renter) {
		this.renter=renter;
	}
	
	@Override
	public void rent(String msg) {
		// TODO 自动生成的方法存根
		System.out.println("接受租房請求...");
		this.renter.rent(msg);
		System.out.println("完成租房請求！");
	}
	
}
