package sort;
/*
 * 冒泡排序
 * */
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return;
		}
		/*for(int first = 0;first<arr.length-1;first++) {
			for(int i=arr.length-2;i>first-1;i--) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
			for(int i=0;i<arr.length-1-first;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
		}*/
		for(int end = arr.length-1;end>0;end--) {
			for(int i =0;i<end;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int[] x = {8,10,7,5,3,};
		BubbleSort b = new BubbleSort();
		b.bubbleSort(x);
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+",");
		}
	}
	/*public static void main(String[] args) {
		int[] x = {8,10,7,5,3};
		int temp = 0;
		//比较的轮数
		for(int i = 0;i<x.length-1;i++) {
			//每轮比较的次数
			for(int j = 0;j<x.length-1-i;j++) {
				//两数比较大小，交换位置
				if(x[j]>x[j+1]) {
					temp = x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
	for(int i=0;i<x.length;i++) {
		System.out.print(x[i]+",");
	}
	}*/

}
