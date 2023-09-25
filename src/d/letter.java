package d;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] arr= {'b','d','f','h','z'};
		char target='z';
		System.out.println(letter(arr,target));
	}
static int letter(char arr[], char target) {
	
	int start=0;
	int end=arr.length -1;
	
	while(start<=end) {
		
			int mid=start +(end -start)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}else  {
				start=mid+1;
			
		}
	}
	return arr[start % arr.length];
	
	
}
}

