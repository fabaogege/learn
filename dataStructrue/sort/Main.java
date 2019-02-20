package sort;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		RandomData r = new RandomData();
		/* int[] arr = r.setRandomData(10000); */
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		QuickSort3Ways s = new QuickSort3Ways();
		long beginTime = System.nanoTime();
		s.quickSort(arr);
		
		long endTime = System.nanoTime();
		double nnn = 1000000000;
		double useTime =(endTime- beginTime)/nnn;
		System.out.println("用时:"+useTime+"秒");
		
		
		Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 
		 
		
	}

}
