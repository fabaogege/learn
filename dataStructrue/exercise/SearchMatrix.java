package exercise;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix,int target){
		boolean isFind = false;
        if(matrix!=null&&matrix.length>0&&matrix[0].length>0){
            int row = 0;
            int colunm =matrix[0].length-1;
            while (row<matrix.length&&colunm>=0){
                if(matrix[row][colunm]==target){
                    isFind=true;
                    break;
                }else if(matrix[row][colunm]>target){
                    colunm--;
                }else{
                    row++;
                }
            }
        }
        return isFind;
	}
}
