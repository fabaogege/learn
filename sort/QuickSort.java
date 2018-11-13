package sort;
/*
 * 快速排序
 * */
public class QuickSort {

	public static void main(String[] args) {
		int[] num = {6,8,5,10,2,12};
		int first = 0;
		int last = num.length-1;
		quickSortUse(num,first,last);
		for(int i = 0;i<num.length;i++) {
			System.out.print(num[i]+".");			
		}
	}
	public static void quickSortUse(int[] num,int first,int last) {
		int left = first;
		int right = last;
		int temp=num[left];
		if(left>=right) {	//处理数组只有1个元素的情况
			return;
		}
		while(left<right) {
			while(right>left&&num[right]>=temp) {
				right--;
			}
			num[left]=num[right];
			
			while(left<right&&num[left]<=temp) {
				left++;
			}
			num[right] = num[left];
		}
		
		num[left] = temp;
		quickSortUse(num, first, left-1);
		quickSortUse(num, right+1, last);
		/*int i=first,j=last,temp;  //(1)初始化i、j    
	    if(first>=last) 
	     return ;
	    temp=num[i];                //(2)以第一个数组为比较值,保存到temp中 
	    while(i<j)
	    {    
	      while(j>i&&num[j]>=temp)  //(3)j--,找小值 
	      j--;
	      num[i]= num[j];             //保存小值,到s[i]上 
	       
	      while(i<j&&num[i]<=temp)  //(4)i++,找大值 
	      i++;
	      num[j]=num[i];
	     
	    }
	    num[i]=temp;             //(5)将比较值放在s[i]上 
*/	        
	  /*(6)拆分成两个数组 s[0,i-1]、s[i+1,n-1]又开始排序 */
	 /* quickSortUse(num,first,i-1);         //左
	  quickSortUse(num,i+1,last);        //右     
*/	}
	
}
