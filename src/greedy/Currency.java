package greedy;
/**
 * 
 * @author caiguangzong
 * 币种统计问题
 */
public class Currency {

	public static void main(String[] args) {
		int[] a = { 157, 78, 33, 9 };
		CurrencyStatistics(a);
	}

	public static void CurrencyStatistics(int[] G) {
		int[] a = { 100, 50, 20, 10, 5, 2, 1 };
		int[] b = new int[7];
		for (int i = 0; i < G.length; i++) {//外层循环每个员工工资
			for (int j = 0; j < a.length; j++) {//内层循环每个面值的纸币
				while (G[i] >= a[j]) {//只要当前工资仍大于当前面值的纸币，则继续循环
					G[i] = G[i] - a[j];
					b[j]++;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("需要" + b[i] + "张面值为" + a[i] + "元的纸币");
		}
	}

}
