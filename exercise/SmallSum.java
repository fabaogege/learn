package exercise;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * 问题：小和问题
 * 描述：在一个数组中，每一个数的左边的比当前数小的数的和，叫做这个数组的小和，求一个数组的小和
 * */
public class SmallSum {
	public static int smallSum(int[] arr) {
		if(arr==null||arr.length<2) {
			return 0;
		}
		return mergeSort(arr,0,arr.length-1);
	}
	public static int mergeSort(int[] arr,int L,int R) {
		if(L==R) {
			return 0;
		}
		int mid = (L+R)/2;
		return mergeSort(arr,L,mid)+mergeSort(arr,mid+1,R)+merge(arr,L,mid,R);
	}
	public static int merge(int[] arr,int L,int mid,int R) {
		int[] temp = new int[R-L+1];
		int i=0;
		int p1=L;
		int p2=mid+1;
		int res = 0;
		while (p1<=mid&&p2<=R) {
			if(arr[p1]<arr[p2]) {
				res = res+arr[p1]*(R-p2+1);
				temp[i]=arr[p1];
				p1++;
				i++;
			}else{
				res = res +0;
				temp[i]=arr[p2];
				p2++;
				i++;
			}
		}
		while(p1<=mid) {
			temp[i]=arr[p1];
			p1++;
			i++;
		}
		while(p2<=R) {
			temp[i]=arr[p2];
			p2++;
			i++;
		}
		for(int j = 0;j<temp.length;j++) {
			arr[L+j] = temp[j];
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,5};
		SmallSum s = new SmallSum();
		System.out.println(s.smallSum(arr));
		
	}

}
