package matrix;

public class TestRationalMatrix extends RationalMatrix{
	public static void main(String[] args) {

		String[][] a= {
				{"Ǭ","��"},
				{"��","��"},
				};
		
		String[][] b={
				{"��","��"},
				{"��","��"},
				};

		RationalMatrix r=new RationalMatrix();
		r.add(a, b);
		r.multiply(a, b);
		r.out(c);
		r.out(d);
	}
}
