package leetcode;

import java.util.HashMap;
/**
 * 
 * @author caiguangzong
 * 两数字和
 */
public class Subject1 {

	public static void main(String[] args) {
		int[] a= {3,3,11,15};
		int[] as = Answer1(a,6);
		for(int x:as){
			System.out.println(a[x]);
		}
	}
	
	public static int[] Answer1(int[] a,int target) {
		int[] reArray = new int[2];
		int sub;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i],i);
		}
		for(int i=0;i<a.length;i++) {
			sub=target-a[i];
			if(map.containsKey(sub)&&map.get(sub)!=i) {
				reArray[0] = i;
				reArray[1] = map.get(sub);
			}
		}
		return reArray;
	}

}
