package ArrayListist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
	public static void main(String[] args) {
		List<String> programmingLanguages = new ArrayList<>();
		
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		System.out.println("Initial List: "+programmingLanguages);
		
		//Remove the element at index 5;
		programmingLanguages.remove(5);
		System.out.println("After remove(5): "+programmingLanguages);
		
		//Remove the first occurrence of the given element from the Arraylist
		//(The remove() method returns false if the element does not exist in the Arraylist
		boolean isRemoved = programmingLanguages.remove("Kotlin");
		System.out.println("After remove(\"Kotlin\"): "+programmingLanguages);
		
		//Remove all the elements that exist in a given collection
		List<String> scriptingLanguages = new ArrayList<>();
		
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");
		
		programmingLanguages.removeAll(scriptingLanguages);
		System.out.println("After removeAll(scriptingLanguages): "+programmingLanguages);
		
		//Remove all the elements that satisfy the given predicate
		programmingLanguages.removeIf(n ->(n.charAt(0) == 'T'));
		System.out.println("After Removing all elements that start with :"+programmingLanguages);
		
		//Remove all elements from the ArrayList
		programmingLanguages.clear();
		System.out.println("After clear(): "+programmingLanguages);
	}
}
