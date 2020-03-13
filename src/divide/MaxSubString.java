package divide;
/**
 * 
 * @author caiguangzong
 * 最大字串和问题
 */
public class MaxSubString {

	public static void main(String[] args) {
		int[] a = new int[] { -2, 11, -4, 13, -5, -2 };
		int i = maxSubArray(a);
		System.out.println(i);
	}

	public  static int crossSum(int[] nums, int left, int right, int p) {
		if (left == right)//判断当前数组长度，若左右相等，则直接返回
			return nums[left];
		
		int leftSubsum = Integer.MIN_VALUE;
		int currSum = 0;
		for (int i = p; i > left - 1; --i) {//得到左边最大值
			currSum += nums[i];
			leftSubsum = Math.max(leftSubsum, currSum);
		}

		int rightSubsum = Integer.MIN_VALUE;
		currSum = 0;
		for (int i = p + 1; i < right + 1; ++i) {//得到右边最大值
			currSum += nums[i];
			rightSubsum = Math.max(rightSubsum, currSum);
		}

		return leftSubsum + rightSubsum;
	}

	public static int helper(int[] nums, int left, int right) {
		if (left == right)
			return nums[left];

		int p = (left + right) / 2;//得到数组中间索引

		int leftSum = helper(nums, left, p);//这是情形一，最大子段在左边
		int rightSum = helper(nums, p + 1, right);//这是情形二，最大子段在右边
		int crossSum = crossSum(nums, left, right, p);//这是情形三，一个在左，一个在右

		return Math.max(Math.max(leftSum, rightSum), crossSum);//返回其中的较大值
	}

	public static int maxSubArray(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public static int max_sub_sum(int[] a, int left, int right) {
		int center, i, left_sum, right_sum, s1, s2, lefts, rights;
		if (left == right) {
			if (a[left] > 0) {
				return a[left];
			} else {
				return 0;
			}
		} else {
			center = (left + right) / 2;
			System.out.println(center);
			left_sum=max_sub_sum(a,left,center);
			right_sum=max_sub_sum(a,center,right);
			s1 = 0;
			lefts = 0;
			for (i = center; i >= left; i--) {
				lefts = lefts + a[i];
				if (lefts > s1) {
					s1 = lefts;
				}
			}		
			s2 = 0;
			rights = 0;
			for (i = center + 1; i <= right; i++) {
				rights = rights + a[i];
				if (rights > s2) {
					s2 = rights;
				}
			}
			if ((s1 + s2) < left_sum && right_sum < left_sum) {
				return max_sub_sum(a, left, center);
			}
			if (s1 + s2 < right_sum) {
				return max_sub_sum(a, center, right);
			}		
			return s1 + s2;
		}
	}
}
