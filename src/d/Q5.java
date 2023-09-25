package d;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,8,34,36,45,47,89,90};
		int target=34;
		System.out.println(findingRange(arr,target));
	}
	static int findingRange(int arr[], int target) {
		//first find the range
		//first start with a box size 2
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int newStart=end+1;
			end= end+(end-start +1)*2;
			start=newStart;
		}
		return infinite(arr,target,start,end);
	}
static int infinite(int arr[],int target, int start, int end) {
	
	while(start <=end) {
		int mid=start +(end-start)/2;
		if(target <arr[mid]) {
			end=mid-1;
		}else if(target>arr[mid]) {
			start=mid+1;
		}else {
			return mid;
		}
	}
	return -1;
}
}
