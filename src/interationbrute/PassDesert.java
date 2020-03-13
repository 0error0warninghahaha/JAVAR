package interationbrute;

public class PassDesert {

	public static void main(String[] args) {
		PassDesert.CrossDesert(1000, 500);
	}
	/*
	 * totaldistance:总的距离
	 * caroil：车的载油量
	 */
	public static void CrossDesert(int totaldistance,int caroil) {
		int distance=caroil,oil=caroil;//distance为距终点距离，oil为加油点油量
		int i=1;
		do{
			System.out.println("加油点"+i+",距离出发点"+(totaldistance-distance)+"km"+",油量："+oil+"L");
			i++;
			distance+=caroil/(2*i-1);
			oil=caroil*i;
		}while(distance<totaldistance);		
	}
}
