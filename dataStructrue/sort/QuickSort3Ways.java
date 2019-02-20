package sort;

import java.util.Random;

public class QuickSort3Ways {
	public void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	private void quickSort(int[] arr,int left,int right) {
		//递归终止条件
		if(left >= right) {
			return;
		}
		//v为基准值
		//随机取一个作为值和最前面的值交换，作为v
		 int randomIndex=(new Random().nextInt(right-left+1))+left;
		swap(arr,left,randomIndex);
		int v = arr[left];
				 
		int i = left+1;//i为当前要考察的值,arr[less+1...i-1] == v
		// 取less,greater指针
		int less = left; //arr[left+1...less]<v
		int greater = right+1; //arr[greater...right]>v
		while(i<greater) {
			if(arr[i]==v) {
				i++;
			}else if(arr[i]<v) {
				swap(arr,i,less+1);
				less++;
				i++;
			}else { //arr[i]>v
				swap(arr,i,greater-1);
				greater--;//这里不需要进行i++,因为从右边交换过来的数组依然是需要处理的元素。
			}
		}
		swap(arr,left,less);
		less--;
		
		quickSort(arr,left,less);
		quickSort(arr,greater,right);
	}

	private void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
