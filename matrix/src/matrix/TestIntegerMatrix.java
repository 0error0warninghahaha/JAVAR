package matrix;

import java.util.Scanner;

public class TestIntegerMatrix extends IntegerMatrix{
	public static void main(String[] args) {

		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		
		 Scanner s = new Scanner(System.in);
		 
			 for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					a[i][j]= s.nextInt();
				}
			 }
			 
			 for(int i=0;i<2;i++) {
					for(int j=0;j<2;j++) {
						b[i][j]= s.nextInt();
					}
				 }
	        

		IntegerMatrix i=new IntegerMatrix();
		i.add(a, b);
		i.multiply(a, b);
		i.out(c);
		i.out(d);
	}
}
