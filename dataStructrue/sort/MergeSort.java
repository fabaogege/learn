package sort;

public class MergeSort {
	public void mergeSort(int[] arr) {
		mergeSort(arr,0,arr.length-1);
	}
	//递归使用递归排序，对arr[left....righy]的范围进行排序
	private void mergeSort(int[] arr,int left,int right) {
		//终止条件
		if(left>=right)
			return;
		int mid = left+(right-left)/2;
		//对分开的左右2部分进行分别归并排序
		mergeSort(arr,left,mid);
		mergeSort(arr, mid+1, right);
		 //if(arr[mid]>arr[mid+1])//如果可能会面对近乎有序的情况的话。可以进行这步优化
		merge(arr,left,mid,right);
		
	}
	//归并排序的2部分arr[left...mid]和arr[mid+1...right]进行合并
	private void merge(int[] arr,int left,int mid,int right) {
		//开辟临时空间,大小为left-right的元素大小.right-left+1
		int [] num = new int[right-left+1];
		//临时空间复制的时候注意偏移量。
		for(int i=left;i<=right;i++) {
			num[i-left] = arr[i];
		}
		int i =left;
		int j =mid+1;
		for(int k=left;k<=right;k++) {
			//2部分数组如果有一边到末尾了要进行判断
			if(i>mid) {
				arr[k] = num[j-left];
				j++;
			}else if(j>right) {
				arr[k] = num[i-left];
				i++;
			}
			//这样2部分的数组指针就都不会越界了。进行2边的比较判断
			else if(num[i-left]<num[j-left]) {
				arr[k]=num[i-left];
				i++;
			}else { //aux[i-left]>=aux[j-left]
				arr[k] = num[j-left];
				j++;
			}
		}
	}
	//自底向上的归并排序
	public void mergeSortBU(int[] arr) {
		for(int size=1;size<=arr.length;size+=size) {
			for(int i=0;i<arr.length;i+=size+size) {
				//对arr[i...i+size-1]和arr[i+size..i+2*size-1]进行归并
				merge(arr,i,i+size-1,Math.min(i+size+size-1, arr.length-1));
			}
		}
	}
}
