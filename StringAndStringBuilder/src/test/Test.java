package test;
/**
 * 
 *@author caiguangzong
 *StringBuild的是个动态对象，可直接拼加上字符串；而string对象的步骤：
 *先初始化对象并赋值了，而后在拼加字符串时，先要创建需要拼加的字符串对象，然后再拼加，所以这就是StirngBuild远比String效率高的原因
 */
public class Test {

	public static void main(String[] args) {
		 String s1 = "a";
	        long startTime1 = System.currentTimeMillis();
	        for(int i =0 ; i<100000;i++){
	            s1 += "a";
	        }
	        long endTime1 = System.currentTimeMillis();
	        System.out.println("String拼接100000遍耗时：" + (endTime1 - startTime1) + "ms");
	          
	        StringBuilder s3 = new StringBuilder();
	        long endTime2 = System.currentTimeMillis();	
	        for(int i =0 ; i<100000;i++){
	            s3.append("a");
	        }
	        long endTime3 = System.currentTimeMillis();
	        System.out.println("StringBuilder拼接100000遍耗时：" + (endTime3 - endTime2) + "ms");
	}

}
