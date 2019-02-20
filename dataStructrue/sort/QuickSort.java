package sort;

import java.util.Random;

public class QuickSort {
	public void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	private void quickSort(int[] arr,int left,int right) {
		
		//递归终止条件
		if(left >= right) {
			return;
		}
		//获取一个下标值，arr[left...p-1]<arr[p];arr[p+1...r]>arr[p]
		int p = partition(arr,left,right);
		
		quickSort(arr,left,p-1);
		quickSort(arr,p+1,right);
	}
	//对arr[left....right]部分进行partition操作。
	//返回一个p下标，使得arr[left...p-1]<arr[p];arr[p+1...r]>arr[p]的2部分
	private int partition(int[] arr,int left,int right) {
		//v为基准值
		//随机取一个作为值和最前面的值交换，作为v
		
		 int randomIndex=(new Random().nextInt(right-left+1))+left; 
		 swap(arr,left,randomIndex);
		
		int v = arr[left];
		//遍历整个数组，对每一个元素都进行判断
		//当前元素为i，<v和>v的分界下标为j
		//arr[l+1...j]<v;   arr[j+1...i-1]>v 
		//初始的时候都为空
		int j=left;
		for(int i=left+1;i<=right;i++) {
			//如果当前元素小于设置的判断值V，将当前的小于V的元素和第一个大于V的元素交换位置，然后j++,这样<V的数组就扩充了
			if(arr[i]<v) {
				swap(arr, i, j+1);
				j++;
			}
			//如果大于V的话，就可以不用管了。因为大于V的范围就是到i-1，循环自动i++就好了
		}
		swap(arr,left,j);
		return j;
	}
	private void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
