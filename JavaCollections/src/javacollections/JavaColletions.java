package javacollections;

import java.util.HashMap;
//import java.util.HashSet;

public class JavaColletions {

	public static void main(String[] args) {
		HashMap<String, Integer> myBooks= new HashMap<>();
		
		
		myBooks.put("Ender's Game", 4);
		myBooks.put("Ringworld", 3);
		myBooks.put("Heir to the Empire", 5);
		
		
		//for(String title : myBooks.keySet())
			//System.out.println(title);
		
		//for(int score : myBooks.values())
			//System.out.println(score);
		
		for(String title :myBooks.keySet())
			System.out.println(title + " é nota " + myBooks.get(title));
		
	}
	
	
	
	//public static void main(String[] args) {
		//HashSet<String> mySet = new HashSet<>();
		
		
		//mySet.add("Banana");
		//mySet.add("Apple");
		//mySet.add("Orange");
		
		//for(String fruit : mySet)
		//*	System.out.println(fruit);
		
		
		//System.out.println("Banana: " +mySet.contains("Banana")); //True
		
		//mySet.remove("Banana");
		
		//*System.out.println("Banana: " +mySet.contains("Banana")); // False
	}
//}
