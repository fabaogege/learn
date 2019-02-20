package sort;

public class BubbleSort {
	public void bubbleSort(int[] arr) {
		//外层循环控制了排序的轮数
		for(int i=0;i<arr.length-1;i++) {
			//内层循环控制每轮排序比较几次
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
