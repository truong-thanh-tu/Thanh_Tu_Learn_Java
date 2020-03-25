package Java_15;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	
	Author a = new Author("John","gender@com",'c');
	public Book(String name, Author author,double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	public Author getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "Book [ name = "+name +", email ="+a.getEmail()+", gender= "+a.getGender()+"]"; 
	}
}
