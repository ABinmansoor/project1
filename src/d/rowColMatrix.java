package d;

import java.util.Arrays;

public class rowColMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {
				{1,4,6,54},{23,24,45,67},{34,45,47,78}
		};
		System.out.println(Arrays.toString(search(arr,4)));
	}  
static int [] search(int [][] matrix, int target) {
	int r=0;
	int c=matrix.length - 1;
	
	while(r<matrix.length && c>=0) {
		if(matrix[r][c]==target) {
			return new int [] {r,c};
	}
		if(matrix[r][c]<target) {
			r++;
		}else {
			c--;
		}
}
	return new int[] {-1,-1};
}
}