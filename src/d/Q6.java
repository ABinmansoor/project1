package d;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4,5,4,3,2,1};
		
		System.out.println(mountInArray(arr));
	}
static int mountInArray(int []arr) {
	int start=0;
	int end=arr.length-1;
	
	while(start < end) {
		int mid=start+(end-start)/2;
		
	    if(arr[mid]>arr[mid+1]) {
	    	end=mid;
	    }else {
	    	start=mid+1;
	    }
	}
	return start;
}
}
