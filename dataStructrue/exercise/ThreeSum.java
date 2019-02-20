package exercise;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		int[] result = new int[3];
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				result[0] = nums[i];
				break;
			}
		}
		Arrays.asList(1,2,2);
		//取得第一个负数以后，另外 2个数一定是后面的2个的和+这个负数=0;
		return list;
    }
}
