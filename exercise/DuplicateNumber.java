package exercise;

import java.util.ArrayList;

public class DuplicateNumber {

    public static void main(String[] args) {
    	int[] arr = {0,3,1,0,5,5,6};
    	ArrayList a = new ArrayList();
    	a.add(0);
        int duplicate = duplicateNumber(arr);
        System.out.println(a.get(0));
        System.out.println("重复的数字为: " + duplicate);
    }

    /**
     * 求数组中重复的数字
     * 分析：如果数组中没有重复的数字，则第i位置应该放置的数字为i。可以重排此数组，让对应位置上的数字对应。
     * @param arr
     * @return
     */
    private static int duplicateNumber(int[] arr) {
        // TODO Auto-generated method stub
        if(arr == null || arr.length <= 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){ //判断输入数组的合法性
            if(arr[i] < 0 || arr[i] >= arr.length){
                return -1;
            }
        }
        for(int index=0;index<arr.length;index++){
            while(index!=arr[index]) {
            	if(index!=arr[index]&&arr[index]==arr[arr[index]]) {
            		return arr[index];
            	}else {
            		swap(arr,index,arr[index]);
            	}
            }
        }
        return -1;
    }
    
    /**
     * 交换数组array中的第i位和第j位
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



/*public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    int hash[]=new int[length]; 
	    for(int i=0;i<length;i++){
	    	if(hash[numbers[i]]==0){
	    		hash[numbers[i]]++;
	    	}
	    	else{
	    		duplication[0]=numbers[i];
	    		return true;
	    	}
	    }
	    return false;
    }*/



/*public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||length<=0){
            return false;
        }
        for(int i=0;i<length;i++){
            if(numbers[i]<0&&numbers[i]>length){
                return false;
            }
        }
         
       for(int i=0;i<length;i++){
            while(i!=numbers[i]){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                    int temp = numbers[i];
                    numbers[i] = numbers[temp];
                    numbers[temp] = temp;
            }
        }
        return false;
    }
}*/