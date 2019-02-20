package exercise;


public class FindMedianSortedArrays {
	public static void main(String[] args) throws Exception {
		int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(findMedianSortedArrays(nums1));
	}
	public static int findMedianSortedArrays(int[] nums) {
		if(nums==null || nums.length == 0){
            return 0;
        }
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
    
}
/*
 * public static double findMedianSortedArrays(int[] nums1, int[] nums2) { int[]
 * num = new int[nums1.length+nums2.length];
 * 
 * for(int i=0;i<nums1.length;i++){ num[i] = nums1[i]; }
 * 
 * //// 1.将要复制的数组 2.从将要复制的数组的第几个元素开始 3.目标数组 4.将要放到目标数组的那个位置 5.复制多少个元素
 * System.arraycopy(nums1, 0, num, 0, nums1.length);
 * 
 * for(int i=nums1.length;i<num.length;i++){ num[i]=nums2[i-nums1.length]; }
 * 
 * System.arraycopy(nums2, 0, num, nums1.length, nums2.length); int i =0; int j
 * =0; int k=0; int mid =num.length/2;
 * 
 * while(k<=mid){
 * 
 * 
 * if(i>nums1.length-1){ num[k] = nums2[j]; j++; k++; }else
 * if(j>nums2.length-1){ num[k] =nums1[i]; i++; k++; }else
 * if(nums1[i]<nums2[j]){ num[k]=nums1[i]; i++; k++; }else{ num[k]=nums2[j];
 * j++; k++; } } if(num.length%2 ==1) { return num[mid]; }else { int result
 * =(num[mid-1]+num[mid])/2; return result; } }
 * 
 * }
 * 
 * import java.util.Arrays; class Solution { public double
 * findMedianSortedArrays(int[] nums1, int[] nums2) { int[] num = new
 * int[nums1.length+nums2.length]; for(int i=0;i<nums1.length;i++){ num[i] =
 * nums1[i]; } for(int i=nums1.length;i<num.length;i++){
 * num[i]=nums2[i-nums1.length]; } Arrays.sort(num); int mid =num.length/2;
 * if(num.length%2 ==1) { return num[mid]; }else { double x = 2; double result
 * =(num[mid-1]+num[mid])/x; return result; } } }
 */
