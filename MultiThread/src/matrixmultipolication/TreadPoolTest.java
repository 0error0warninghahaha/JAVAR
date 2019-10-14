package matrixmultipolication;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadPoolTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Scanner sca=new Scanner(System.in);
		int i=sca.nextInt();
		int[][] a=new int[i][i];
		int[][] b=new int[i][i];
		int[][] c=new int[i][i];
		int m,n,p,q;
		int MissionNum = 10;
		q=i/MissionNum;
		CountDownLatch countDownLatch = new CountDownLatch(MissionNum);
		
		for(m=0;m<i;m++) {
			for(n=0;n<i;n++) {
				a[m][n]=(int) (Math.random()*10);
				b[m][n]=(int) (Math.random()*10);
			}
		}
		
		ExecutorService pool = Executors.newFixedThreadPool(10);
		long startTime1 = System.currentTimeMillis();
		for(p=0;p<MissionNum;p++) {
			ThreadPool ThreadPool = new ThreadPool(i,a,b,p,q,c,countDownLatch);
			pool.execute(ThreadPool);
			
		}
		countDownLatch.await();
		pool.shutdown();
		long endTime1 = System.currentTimeMillis();
		
		System.out.println( (endTime1 - startTime1) + "ms");
	}

}
