package d;

import java.util.Arrays;

public class bubblleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,24,0,2,-3};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
static void bubble(int []arr) {
	boolean swapped;
	for(int i=0;i<arr.length;i++) {
		  swapped=false;
		for(int j=1;j<arr.length -i;j++) {
			
			if(arr[j-1]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				swapped=true;
			}
		}
		if(!swapped) {
			break;
			}
	}
}
}
