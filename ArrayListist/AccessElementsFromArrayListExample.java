package ArrayListist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
	public static void main(String[] args) {
		List<String> toCompanies = new ArrayList<>();
		
		// Check if an ArrayList is empty
	
		
		toCompanies.add("Google");
		toCompanies.add("Apple");
		toCompanies.add("Microsoft");
		toCompanies.add("Amazon");
		toCompanies.add("Facebook");
		System.out.println("Is the toCompanies list empty ?: "+toCompanies.isEmpty());	
		
		//Find the size of an ArrayList
		System.out.println("Here are the top "+toCompanies.size()+" companies in the world");
		System.out.println(toCompanies);
		
		//Retrieve the element at a given index
		String bestCompany = toCompanies.get(0);
		String secondBestCompany = toCompanies.get(1);
		String lastCompany = toCompanies.get(toCompanies.size() -1);
	
		System.out.println("Best Company: "+bestCompany);
		System.out.println("Second Best Company: "+secondBestCompany);
		System.out.println("Last Company in the list: "+lastCompany);
		
		//Modify the element at a given index
		toCompanies.set(1,"Walmart");
		System.out.println("Modified to companies list: "+toCompanies);
	}
}
