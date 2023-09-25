package d;

public class binary2 {

	public static void main(String[] args) {

		
		int [] arr= {1,3,6,7,8,9,23,45,67};
		int target=2;
		System.out.println(ceiling(arr,target));
	}
static int ceiling(int arr[], int target) {
	
	int start=0;
	int end=arr.length -1;
	
	while(start<=end) {
		
			int mid=start +(end -start)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
	
	return start;
	
	
}
}
