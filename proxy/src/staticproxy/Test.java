package staticproxy;

public class Test {
	public static void main(String[] args) {
		Renter renter =new Renter();
		Intermediary intermediary=new Intermediary(renter);
		intermediary.rent("²Ì¹â×Ú");
	}
}
