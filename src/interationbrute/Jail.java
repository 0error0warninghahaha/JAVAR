package interationbrute;

public class Jail {

	public static void main(String[] args) {
		Jail.jail(1000);
		Jail.jail2(1000);
		Jail.jail3(1000);
	}
	
	public static void jail(int n) {
		long startTime = System.currentTimeMillis();
		int i,j;
		int[] a=new int[n+1];
		for(i=1;i<=n;i++) {
			a[i]=1;
		}
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j=j+i) {
				a[j]=1-a[j];
			}
		}
		for(i=1;i<=n;i++) {
			if(a[i]==0) {
				System.out.println(i+"号牢房犯人得到释放");
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("耗时"+ (endTime - startTime) + "ms");
	}
	
	public static void jail2(int n) {
		long startTime = System.currentTimeMillis();
		int s,i,j;
		for(i=1;i<=n;i++) {
			s=1;
			for(j=2;j<=i;j++) {
				if(i%j==0) {
					s=s+1;
				}
			}
			if(s%2==1) {
				System.out.println(i+"号牢房犯人得到释放");
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("耗时"+ (endTime - startTime) + "ms");
	}
	
	public static void jail3(int n) {
		long startTime = System.currentTimeMillis();
		int i;
		for(i=1;i<=n;i++) {
			if(i*i<n) {
				System.out.println(i*i+"号牢房犯人得到释放");
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("耗时"+ (endTime - startTime) + "ms");
	}
}
