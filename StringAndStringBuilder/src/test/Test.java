package test;
/**
 * 
 *@author caiguangzong
 *StringBuild���Ǹ���̬���󣬿�ֱ��ƴ�����ַ�������string����Ĳ��裺
 *�ȳ�ʼ�����󲢸�ֵ�ˣ�������ƴ���ַ���ʱ����Ҫ������Ҫƴ�ӵ��ַ�������Ȼ����ƴ�ӣ����������StirngBuildԶ��StringЧ�ʸߵ�ԭ��
 */
public class Test {

	public static void main(String[] args) {
		 String s1 = "a";
	        long startTime1 = System.currentTimeMillis();
	        for(int i =0 ; i<100000;i++){
	            s1 += "a";
	        }
	        long endTime1 = System.currentTimeMillis();
	        System.out.println("Stringƴ��100000���ʱ��" + (endTime1 - startTime1) + "ms");
	          
	        StringBuilder s3 = new StringBuilder();
	        long endTime2 = System.currentTimeMillis();	
	        for(int i =0 ; i<100000;i++){
	            s3.append("a");
	        }
	        long endTime3 = System.currentTimeMillis();
	        System.out.println("StringBuilderƴ��100000���ʱ��" + (endTime3 - endTime2) + "ms");
	}

}
