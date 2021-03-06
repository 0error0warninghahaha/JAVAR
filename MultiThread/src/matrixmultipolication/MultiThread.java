package matrixmultipolication;

import java.util.concurrent.CountDownLatch;

public class MultiThread implements Runnable{
	int m,n,x,w;
	private int[][] a;
	private int[][] b;
	private int p;
	private int q;
	private int[][] c;
	private CountDownLatch countDownLatch;
	
	public MultiThread(int w,int[][] a, int[][] b,int p,int q, int[][] c, CountDownLatch countDownLatch) {
		this.w = w;
		this.a = a;
		this.b = b;
		this.p = p;
		this.q = q;
		this.c = c;
		this.countDownLatch = countDownLatch;
	}
	
	public void multiply() {
		for (int i = p * q; i < (p + 1) * q; i++) {
			for (m = 0; m < w; m++) {
				for (n = 0; n < w; n++) {
					c[i][m] += a[i][n] * b[n][m];// c[i][m] +
				}
			}
		}
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		multiply();
		countDownLatch.countDown();
	}

}
