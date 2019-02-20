package exercise;
import java.util.Stack;
public class SingleNumber {
	public int singleNumber(int[] nums) {
        //暴力法
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
        	int x = nums[i];
            stack.push(nums[i]);
            boolean isRepeat = false;
            for(int j=0;j<nums.length;j++){
               if(i != j) {
            	   if(nums[j] == stack.peek()) {
            		   isRepeat = true;
                       break;
            	   }
               }else {
            	   continue;
               }
            }
            if(isRepeat == false){
                return nums[i];
            }
            stack.pop();
        }
        return nums[0];
    }
}
