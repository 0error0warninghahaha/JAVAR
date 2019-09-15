package matrix;

public class RationalMatrix extends GenericMatrix{
	static String c[][]=new String[2][2];
	static String[][] d= {
			{"false","false"},
			{"false","false"},
			};
	static String e[][]=new String[2][2];

	public void add(String[][] a, String[][] b) {
		// TODO 自动生成的方法存根
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	}


	public void multiply(String[][] a, String[][] b) {
		// TODO 自动生成的方法存根
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					if(d[i][j]=="false")
					d[i][j]=a[i][k]+b[k][j];
					else 
						d[i][j]+=a[i][k]+b[k][j];
				}
				//d[i][j]=e[i][j]+e[i][k];
				}
			}
		
	}

	public void out(String[][] a) {
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

