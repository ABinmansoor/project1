package d;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=fib(4);
		System.out.println(x);
	}
static int fib(int n) {
	
	if(n<2) {
		return n;
	}else {
		return fib(n-1)+fib(n-2);
	}
	
}
}
