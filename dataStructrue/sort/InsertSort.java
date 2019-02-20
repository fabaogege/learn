package sort;

public class InsertSort {
	public void insertSort(int[] arr) {
		//从第二个元素开始，因为插入排序第一个元素自己本来就默认有序了。
		for(int i=1;i<arr.length;i++) {
			//选择arr[i]需要插入的位置，从后往前
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else //如果j已经大于前一个元素，说明j已经是合适的位置了。因为前面的序列已经排序了的。
					break;
			}
		}
	}
	//虽然插入排序在新元素大于已排序的值时候可以直接break跳出循环
	//由于新元素往后面扫描的过程，每次小于判断成功后都会进行一次交换操作，这样就太耗费时间了。所以需要进行改进一下
	public void insertSortGaijin(int[] arr) {
		//从第二个元素开始，因为插入排序第一个元素自己本来就默认有序了。
		for(int i=1;i<arr.length;i++) {
			int e = arr[i];//定义一个元素e来存储新元素的值
			int j;//j为元素e应该插入的位置
			for(j=i;j>0;j--) {
				if(e<arr[j-1])
					//如果新元素小于前一个元素，则前一个元素的值就赋值给新元素位置（相当于往后挪一位）
					arr[j] = arr[j-1];
			}
			arr[j] =e;
		}
	}
}
