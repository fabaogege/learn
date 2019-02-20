package exercise;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int[] result = new int[2];
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],i);
	        }
	        for(int i=0;i<nums.length;i++){
	            int find = target - nums[i];
	            if(map.containsKey(find) && map.get(find)!=i){
	                result[0] = i;
	                result[1] = map.get(find);
	                return result;
	            }
	        }
	        throw new IllegalArgumentException("没有找到目标值");
	    
	}
}
 class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int [] result =new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					result[0] = i;
					result[j] =j;
					return result;
				}
			}
		}
		throw new IllegalArgumentException("没有找到与目标值相同的");
	}
}
