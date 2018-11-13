package exercise;

public class ZhiZiPriint {
	public static int[] zhiZiPrint(int[][] arr) {
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
			int x =0;
			int y = 0;
			while(count<num.length-1) {
				
				/*while(x>=0&&x<=leftTopX&&x>1) {
					num[count++]=arr[x++][y++];
				}
				x--;
				while(y>=0&&y>leftTopY) {
					num[count++]=arr[x++][y--];
				}
				y++;
				while(x>=0) {
					num[count++] = arr[x--][y++];
				}
				x++;
				while(y>=0) {
					num[count++]=arr[x++][y--];
				}*/
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<zhiZiPrint(arr).length;i++) {
			System.out.println(zhiZiPrint(arr)[i]);
		}
	}

}
