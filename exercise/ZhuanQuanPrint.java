package exercise;

public class ZhuanQuanPrint {
	public static int[] zhuanQuan(int[][] arr) {
		int[] num = new int[arr.length*arr[0].length];
		int count = 0;
		int leftTopX =0;
		int leftTopY =0;
		int rightDownX = arr.length-1;
		int rightDownY = arr[arr.length-1].length-1;
		if(leftTopX==rightDownX) {
			for(int i=0;i<arr[leftTopX].length;i++) {
				num[i] = arr[leftTopX][i];
			}
		}else if(leftTopY==rightDownY) {
			for(int i=0;i<arr.length;i++) {
				num[i] = arr[i][leftTopY];
			}
		}else {
			int x =leftTopX;
			int y = leftTopY;
			while(count<num.length-1) {
				while(y!=rightDownY) {
					num[count++] = arr[x][y++];
				}
				while(x!=rightDownX) {
					num[count++] = arr[x++][y];
				}
				while(y!=leftTopX) {
					num[count++] = arr[x][y--];
				}
				while(x!=leftTopX) {
					num[count++] = arr[x--][y];
				}
				x++;
				y++;
				leftTopX++;
				leftTopY++;
				rightDownX--;
				rightDownY--;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<zhuanQuan(arr).length;i++) {
			System.out.println(zhuanQuan(arr)[i]);
		}
	}

}
