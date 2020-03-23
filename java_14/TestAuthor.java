package java_14;

public class TestAuthor {
	public static void main(String[] args) {
		Author ahTeck = new Author("Tan ah Teck","teck@nowhere.com",'m');
		System.out.println(ahTeck);
		
		ahTeck.setEmail("teck@somewhere.com");
		System.out.println(ahTeck);
		
		System.out.println("name ís : "+ahTeck.getName());
		System.out.println("gender is : "+ahTeck.getGender());
		System.out.println("email is : "+ahTeck.getEmail());
	}
}
