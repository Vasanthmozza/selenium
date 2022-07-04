package basicprogram;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		
		
		int length = n.length();
		System.out.println(length);
		for(int i=length-1;i>=0;i--) {
			System.out.print(n.charAt(i));
		}
	}

}
