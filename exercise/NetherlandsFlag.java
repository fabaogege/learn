package exercise;
/*
 * 问题：荷兰国旗
 * 描述：给定一个数组arr，和一个数num，请把小于num的数放在数组的左边，等于Num的数放在数组中间，大于
 * 	Num的数放在数组的右边
 * 要求额外空间复杂度O(1)，时间复杂度O(n)
 * 
 */
public class NetherlandsFlag {
	public static void netherlandsFlag(int[] arr,int num) {
		int L = 0;
		int R = arr.length-1;
		int current=0;
		int smaller = L-1;
		int bigger =R+1;
		while(current<bigger) {
			if(arr[current]<num) {
				swap(arr,++smaller,current++);
			}else if(arr[current]>num) {
				swap(arr,--bigger,current);
			}else {//==num
				current++;
			}
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,4,7,2,1,4,8};
		int num = 4;
		NetherlandsFlag n = new NetherlandsFlag();
		n.netherlandsFlag(arr, num);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
/*public class NetherlandsFlag {

	public static int[] partition(int[] arr, int l, int r, int p) {
		int less = l - 1;
		int more = r + 1;
		while (l < more) {
			if (arr[l] < p) {
				swap(arr, ++less, l++);
			} else if (arr[l] > p) {
				swap(arr, --more, l);
			} else {
				l++;
			}
		}
		return new int[] { less + 1, more - 1 };
	}

	// for test
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// for test
	public static int[] generateArray() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 3);
		}
		return arr;
	}

	// for test
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] test = generateArray();
		printArray(test);
		int[] res = partition(test, 0, test.length - 1, 1);
		printArray(test);
		System.out.println(res[0]);
		System.out.println(res[1]);

	}
}*/
