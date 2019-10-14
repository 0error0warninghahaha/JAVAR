package matrixmultipolication;

import java.util.Scanner;

public class SingleThread {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int i=sca.nextInt();
		//System.out.println(i+j);
		int[][] a=new int[i][i];
		int[][] b=new int[i][i];
		int[][] c=new int[i][i];
		int m,n,p;
		for(m=0;m<i;m++) {
			for(n=0;n<i;n++) {
				a[m][n]=(int) (Math.random()*10);
				b[m][n]=(int) (Math.random()*10);
			}
		}
		long startTime1 = System.currentTimeMillis();
		for(m=0;m<i;m++) {
			for(n=0;n<i;n++) {
				for(p=0;p<i;p++) {
				c[m][n]+=a[m][p]*b[p][n];
				}
			}
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println( (endTime1 - startTime1) + "ms");
	}
}
