package matrixmultipolication;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MultiThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Scanner sca=new Scanner(System.in);
		int i=sca.nextInt();
		int[][] a=new int[i][i];
		int[][] b=new int[i][i];
		int[][] c=new int[i][i];
		int m,n,p,q;
		int ThreadNum = 50;
		q=i/ThreadNum;
		CountDownLatch countDownLatch = new CountDownLatch(ThreadNum);
		
		for(m=0;m<i;m++) {
			for(n=0;n<i;n++) {
				a[m][n]=(int) (Math.random()*10);
				b[m][n]=(int) (Math.random()*10);
			}
		}
				
		long startTime1 = System.currentTimeMillis();
		for(p=0;p<ThreadNum;p++) {
			MultiThread multiThread = new MultiThread(i,a,b,p,q,c,countDownLatch);
			Thread thread = new Thread(multiThread);
			thread.start();
		}
		countDownLatch.await();
		long endTime1 = System.currentTimeMillis();
		
		System.out.println( (endTime1 - startTime1) + "ms");
	}

}
