package d;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {100,98,87,74,63,54,34,1};
		int target=870;
		System.out.println(binary(arr,target));
		
		
	}
static int binary(int [] arr,int target) {
	int start=0;
	int end=arr.length -1;
	
	if(arr[start]<arr[end]) {
	while(start <=end) {
		//int mid=(start+end) /2;
		int mid=start +(end-start)/2;
		if(target <arr[mid]) {
			end =mid -1;
		}else if(target >arr[mid]) {
			start =mid+1;
		}else {
			return mid;
		}
	}
	}
	else  {
		while(start <=end) {
			//int mid=(start+end) /2;
			int mid=start +(end-start)/2;
			if(target >arr[mid]) {
				end =mid -1;
			}else if(target >arr[mid]) {
				start =mid+1;
			}else {
				return mid;
			}
	}
			
	}
	return -1;
}
}


