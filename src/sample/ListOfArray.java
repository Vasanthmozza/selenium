package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfArray {

	public static void main(String[] args) {
		String s = "English,Tamil,Telugu,Canada";
		
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));

		System.out.println(myList.size()); 
		System.out.println(s);
		
		for(int i=0;i<=myList.size()-1;i++) {
			
			System.out.println(myList.get(i));
		}
	
		
		
	}

}
