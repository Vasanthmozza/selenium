package basicprogram;

public class CountOfEvenNumber {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				count++; 
				//count=count+1; // both are same 
				}
		}
System.out.println(count);
	}


}
