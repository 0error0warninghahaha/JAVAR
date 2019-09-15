package staticproxy;

public class Intermediary implements Rent{
	private Renter renter;
	
	public Intermediary(Renter renter) {
		this.renter=renter;
	}
	
	@Override
	public void rent(String msg) {
		// TODO �Զ����ɵķ������
		System.out.println("�����ⷿՈ��...");
		this.renter.rent(msg);
		System.out.println("����ⷿՈ��");
	}
	
}
