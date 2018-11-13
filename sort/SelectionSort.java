package sort;
/*
 * 选择排序
 * 原理：1.在序列里面找出最大(最小)值,与序列的第一个数进行交换作为已排序序列
 * 	   2.然后在剩余未排序元素里面找出最大（最小）值，排在已排序序列的最后。以此类推，直到排序完毕
 * */
public class SelectionSort {
	public static void selectionSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return;
		}
		for(int i =0;i<arr.length-1;i++) {
			int minIndex =i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			swap(arr,i,minIndex);
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		//int[] num = {8,10,7,5,3};
		int[] arr = {10,5,8,3,4};
		SelectionSort s = new SelectionSort();
		s.selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
}
