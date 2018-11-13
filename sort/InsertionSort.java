package sort;
/*
 * ��������
 * ԭ��1.����һ��Ԫ����Ϊ������Ԫ��
 * 		2.ȡ����һ��Ԫ�أ�����������������Ӻ���ǰ�Ƚϴ�С��
 * 			3.�������������ĸ�Ԫ�ش���get����Ԫ�أ����Ԫ�������һλ��
 * 				4.�ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�á�
 * 					5.��getԪ�ز��뵽��������Ԫ�غ��棨����[������Ԫ��+1]=get��
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
