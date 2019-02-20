package sort;
import java.util.Random;
public class RandomData {
	public int[] setRandomData(int n) {
		Random r = new Random();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			//添加0到500万之间的任意数字
			arr[i] = r.nextInt(5000000);
		}
		return arr;
	}
}
