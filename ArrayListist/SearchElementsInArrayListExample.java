package ArrayListist;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("John");
	names.add("Alice");
	names.add("Bob");
	names.add("Steve");
	names.add("John");
	names.add("Steve");
	names.add("Maria");
	
	//Check if an Arraylist contains a given element
	System.out.println("Does name array contain \"Bob\"? :"+names.contains("Bob"));
	
	//Find the index of the first occurrence of an element in an ArrayList
	System.out.println("indexOf \"Steve\" : "+names.indexOf("Steve"));
	System.out.println("indexOf \"Mark \" : "+names.indexOf("Mark"));
	
	//Find the index of the last occurrence of an element in an ArrayList
	System.out.println("LastIndexOf \"John\" : "+names.lastIndexOf("John"));
	System.err.println("LastIndexOF  \"Bill\" : "+names.lastIndexOf("Bill"));
}
}
