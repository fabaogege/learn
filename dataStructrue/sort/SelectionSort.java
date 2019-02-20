package sort;

public class SelectionSort {
	public void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//i到n是未排序序列，找出[i,n)区间的最小值
			//定义min为未排序序列的最小值，初始化为已排序序列的末尾值
			int min = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) 
					min = j;
			}
			//交换
			swap(arr, i, min);
		}
	}
	private void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}