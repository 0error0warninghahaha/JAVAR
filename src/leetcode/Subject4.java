package leetcode;

/**
 * 
 * @author caiguangzong 有序数组中位数
 */
public class Subject4 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 7, 9 };
		int[] b = { 2, 5 };
		System.out.println(midnum(a, b));
	}

	public static double midnum(int[] nums1, int[] nums2) {
		double mid1, mid2;
		if (nums1.length != 0) {
			if (nums1.length % 2 == 0) {
				mid1 = (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2;
			} else {
				mid1 = (double) nums1[nums1.length / 2];
			}
		} else {
			mid1 = 0;
		}
		if (nums2.length != 0) {
			if (nums2.length % 2 == 0) {
				mid2 = (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2;
			} else {
				mid2 = (double) nums2[nums2.length / 2];
			}
		} else {
			mid2 = 0;
		}
		if(mid1==0) {
			return mid2;
		}else if(mid2==0) {
			return mid1;
		}else {
			return (mid1 + mid2) / 2;
		}	
	}

}
