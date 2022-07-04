package basicprogram;

import java.util.Scanner;

public class SwappingNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sw= new Scanner(System.in);
		System.out.println("enter the swapping numbers");
		 a=sw.nextInt();
		 b=sw.nextInt();
		 
		a=a+b;// adding a and b
		b=a-b;// a+b-b=a
		a=a-b;//a+b-a=b
		System.out.println("swapped numbers are");
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
