package sort;
/*
 * ѡ������
 * ԭ��1.�����������ҳ����(��С)ֵ,�����еĵ�һ�������н�����Ϊ����������
 * 	   2.Ȼ����ʣ��δ����Ԫ�������ҳ������С��ֵ���������������е�����Դ����ƣ�ֱ���������
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
