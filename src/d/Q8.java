package d;

public class Q8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,6,7,0,1,2,3};
		System.out.println(countRotation(arr));
	}
	static int countRotation(int []arr) {
		int pivot =rotation(arr);
	
			return pivot +1;
		
	}
static int rotation(int [] arr) {
	int start=0;
	int end=arr.length-1;
	
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if(mid<end && arr[mid]>arr[mid+1]) {
			return mid;
		}
		else if(mid>start && arr[mid]<arr[mid-1]) {
			return mid-1;
		}
		else if(arr[mid]<=arr[start]) {
			end=mid -1;
		}
		else {
			start=mid+1;
		}
		
	}
	return -1;
}
}

	
