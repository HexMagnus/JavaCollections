package javacollections;

import java.util.ArrayList;

public class JavaColletions {

	
	
	public static void main(String[] args) {
		ArrayList<Integer>myList = new ArrayList<>();
		
		
		int numOfElements = (int) (Math.random() * 100);
		
		for (int i = 0; i < numOfElements; i++)
			myList.add(i);
		
		for (int element : myList)
		System.out.println(element);
	}
}
