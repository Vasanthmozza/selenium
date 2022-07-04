package basicprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count=0;
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <= 10; i++) {
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c;
		count=count+1;
		
		}
		System.out.println("total fibonacci count upto 10 number is:"+" "+count);
	}

}
