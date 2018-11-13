package sort;
/*
 * 归并排序
 * 先递归再归并
 * */
public class MergeSort {
	public static void mergeSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return;
		}
		reArr(arr,0,arr.length-1);
	}
	//递归过程
	public static void reArr(int[] arr,int L,int R) {
		if(L==R){
			return;
		}
		int mid = (L+R)/2;
		reArr(arr,L,mid);
		reArr(arr,mid+1,R);
		merge(arr,L,mid,R);
	}
	//归并
	public static void merge(int[] arr,int L,int mid,int R) {
		int[] temp = new int[R-L+1];
		int i=0;
		int p1=L;
		int p2=mid+1;
		//有一边超出边界
		while(p1<=mid&&p2<=R) {
			if(arr[p1]<arr[p2]) {
				temp[i]=arr[p1];
				i++;
				p1++;
			}else{
				temp[i]=arr[p2];
				i++;
				p2++;
			}
		}
		while(p1<=mid) {
			temp[i]=arr[p1];
			i++;
			p1++;
		}
		while(p2<=R) {
			temp[i]=arr[p2];
			i++;
			p2++;
		}
		for(int j=0;j<temp.length;j++) {
			arr[L+j]=temp[j];
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,5,8,3,4};
		MergeSort s = new MergeSort();
		s.mergeSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
