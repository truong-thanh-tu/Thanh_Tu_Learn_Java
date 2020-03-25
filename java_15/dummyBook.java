package Java_15;

public class dummyBook {
	public static void main(String[] args) {
		Author codeLean = new Author("code Lean", "codeleanvn@gmail.com", 'f');
		System.out.println(codeLean);
		
		Book dummyBook = new Book("Java for dummy", codeLean, 19.65,99);
		System.out.println(dummyBook);
		
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		
		System.out.println("name is : "+dummyBook.getName());
		System.out.println("price is : "+dummyBook.getPrice());
		System.out.println("qty is : "+dummyBook.getQty());
		System.out.print("Author is : "+dummyBook.getAuthor());
		System.out.println("Author's name is : "+dummyBook.getAuthor().getName());
		System.out.println("Author's email is : "+dummyBook.getAuthor().getEmail());
		
		Book anotherBook = new Book("more Java",new Author("Bert","Bert@gmail.com",'f'), 29.5);
		
		System.out.println(anotherBook);
	}
}
