package d;

public class floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,3,6,7,8,9,23,45,67};
		int target=22;
		System.out.println(floor(arr,target));
	}
static int floor(int arr[], int target) {
	
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
	
	return end;
	
	
}
}

