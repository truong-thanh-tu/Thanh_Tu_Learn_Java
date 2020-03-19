package BOOKSTORE;
import java.util.*;
public class MAIN {
	private static BOOK bookObj = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int function = 0;
		boolean flag = true;
		do {
		System.out.println("========== BOOK MANAGER ===========");
		System.out.println("1. Add book");
		System.out.println("2. Edit book");
		System.out.println("3. Info book");
		System.out.println("4. Exit");
		System.out.println("Your choise [1-4]: ");
		function = sc.nextInt();
	
		switch (function) {
		case 1: {
			addBook();
			break;
		 }
		case 2: {
			editBook();
			break;
		 }
		case 3: {
			infoBook();
			break;
		 }
		case 4: 
	    	default:
	    	flag =false;
		 
		}
	
		}while(flag == true);
		sc.close();
	}
	
	
	public static void addBook() {
		Scanner sc = new Scanner(System.in);
		String bookName  = "";
		String bookID    ="";
		double bookPrice = 0;
		
		System.out.println("ID    : ");
		bookID = sc.nextLine();
		
		System.out.println("Name  : ");
		bookName = sc.nextLine();
		
		System.out.println("Price : ");
		bookPrice = sc.nextDouble();
		
		bookObj = new BOOK(bookID, bookName, bookPrice);
		bookObj.ShowInfo();
	}
	public static void editBook() {
		if(bookObj != null) {
			Scanner sc = new Scanner(System.in);
			String bookName  = "";
			String bookID    ="";
			double bookPrice = 0;
			
			System.out.println("Name    : ");
			bookName = sc.nextLine();
			
			System.out.println("Price  : ");
			bookPrice = sc.nextDouble();
			
			bookObj.setName(bookName);
			bookObj.setPrice(bookPrice);
		}
		else {
			System.out.println("Book is not exist");
		}
	}
	public static void infoBook() {
		if(bookObj != null) {
			bookObj.ShowInfo();
		}
		else {
			System.out.println("Book is not exist");
		}
	}
	public static void Menu(int choise) {
		
	}
	
}
