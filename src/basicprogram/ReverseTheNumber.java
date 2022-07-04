package basicprogram;

import java.util.Scanner;

public class ReverseTheNumber {

 public static void main(String[] args) {
	 Scanner rev=new Scanner(System.in);
	 System.out.println("enter the number");
	

	int n=rev.nextInt();
	int a,i=0,j=0;
	 a=n;
	 while(a>0) {
		 i=a%10; // remainder 4 is stored in i
		 //System.out.println(i);
		 j=(j*10)+i;
		// System.out.println(j);
		 a=a/10;
		//System.out.println(a);
		 
	 }
	 System.out.println("reverse the number is: "+j);
	 
	 
	 
	 
 }


}
