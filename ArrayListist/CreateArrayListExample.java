package ArrayListist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
	public static void main(String[] args) {
		// Creating an Arraylist of String
		List<String> animals = new ArrayList<String>();
		
		//Addinf new elements to the Arraylist
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		
		System.out.println(animals);
		
		//Adding an element at a particular index in an Arraylist
		animals.add(2,"Elephant");
		
		System.out.println(animals);
	}
}
