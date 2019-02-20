package sort;

import java.util.Random;

public class QuickSort2Way {
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
		 // 取i,j指针，表示arr[left+1...i-1]<=v; arr[j...right]>=v
		 int i = left+1;
		 int j = right;
		 while(true) {
			 while(i<=right && arr[i]<v) 
				 i++;
			 while(j>=left+1 && arr[j]>v)
				 j--;
			 if(i>j)
				 break;
			 //交换 i j的值，这样即使有重复的值都可以保证会相对平均
			 swap(arr,i,j);
			 i++;
			 j--;
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
