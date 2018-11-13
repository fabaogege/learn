package sort;
/*
 * 插入排序
 * 原理：1.将第一个元素作为已排序元素
 * 		2.取出下一个元素，在已排序序列里面从后往前比较大小，
 * 			3.如果已排序里面的该元素大于get到的元素，则该元素向后移一位。
 * 				4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置。
 * 					5.将get元素插入到该已排序元素后面（数组[已排序元素+1]=get）
 * */
public class InsertionSort {
	public static void insertionSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return;
		}
		for(int i =1;i<arr.length;i++) {
			while(i>0&&arr[i-1]>arr[i]) {
				swap(arr,i,(i-1));
				i--;
			}
			/*for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--) {
				swap(arr,j,(j+1));
			}*/
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int[] arr = {6,8,5,10,2,4};
		InsertionSort in = new InsertionSort();
		in.insertionSort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+".");
		
		}
	}

}
