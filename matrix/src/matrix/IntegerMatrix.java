package matrix;

public class IntegerMatrix extends GenericMatrix{
	
	static int c[][]=new int[2][2];
	static int d[][]=new int[2][2];
	public void add(int[][] a, int[][] b) {
		// TODO 自动生成的方法存根
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	@Override
	public void multiply(int[][] a, int[][] b) {
		// TODO 自动生成的方法存根
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++)
				d[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
	@Override
	public void out(int[][] a) {
		// TODO 自动生成的方法存根
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
