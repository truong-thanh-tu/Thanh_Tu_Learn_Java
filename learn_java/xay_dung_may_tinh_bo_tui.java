package learn_java;
import java.util.Scanner;
public class xay_dung_may_tinh_bo_tui {
	public static void main(String[] args) {
		int numberFirst;
		int numberSecond;
		int result;
		String caculate;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number First: ");
		numberFirst = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Number Second: ");
		numberSecond = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Caculate: ");
		caculate = sc.nextLine();
		 sc.close();
		 
		System.out.println("Number First: " +numberFirst);
		System.out.println("Number Second: " +numberSecond);
		System.out.println("Caculate: "+caculate);
		
		switch (caculate) {
		case "+": {
			
			result = numberFirst +numberSecond;
			break;
		}
		case "-": {
			
			result = numberFirst  - numberSecond;
			break;
		}
		case "/":
		case ":": {
			
			result = numberFirst /numberSecond;
			break;
		}
		case "%": {
			
			result = numberFirst %numberSecond;
			break;
		}
		case "x":
		case "*": {
			
			result = numberFirst *numberSecond;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + caculate);
		}
		
		System.out.println("==========================");
		System.out.printf("%d %s %d = %d",numberFirst,caculate,numberSecond,result);
	}
}
