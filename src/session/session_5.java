package session;
import java.util.Scanner;
public class session_5 {
//	public static void main(String[] agrc) {
//		int num = 1;
//		int product = 0;
//		while (num <= 5) {
//			product = num * 10;
//			System.out.println(num+"*"+10 +"="+ product);
//			num++;
//		}
//	}
	
//	public static void main(String[] agrc) {
//		int num1 = 1;
//		int num2 = 30;
//		 while(++num1 < --num2);
//		 System.out.print("Midpoint is:" +num1);
//	}
	
//	public static void main(String[] agrc) {
//		while(true) {
//		System.out.print("Welcome to Loops ... ");
//	}
//}
	
//	public static void main(String[] agrc) {
//		int num = 1, sum = 0;
//		do {
//			sum = sum + num;
//			num++;
//		} while(num <= 10);
//		System.out.print(sum);
//		
//	}
	
//	public static void main(String[] agrc) {
//		int num, product;
//		for(num = 1; num <= 5; num++) {
//			product = num*10;
//			System.out.println(num+"*"+10 +"="+ product);
//		}
//	}
	
//	public static void main(String[] argc) {
//		int  product;
//		for(int num = 1; num <= 5; num++) {
//			product = num*10;
//			System.out.println(num+"*"+10 +"="+ product);
//		}
//	}
	
//	public static void main(String[] argc) {
//		int i, j;
//		int max = 10;
//		for(i = 0, j = max; i <= max; i++, j--) {
//			System.out.println(i+"+"+j +"="+ (i+j));
//		}
//	}
	
//	public static void main(String[] argc) {
//		int num = 1;
//		boolean flag = false;
//		for(; !flag;num++) {
//			System.out.println("Value of num: "+num);
//			if(num == 5) {
//				flag = true;
//			}
//		}
//	}
	
//    public static void main(String[] args) {
//    	int cnt, number;
//    	for (cnt = 1, number = 0; cnt <= 10; cnt++) {
//    		// Scanner class is used to accept data from the keyboard
//    		Scanner input = new Scanner(System.in);
//    		System.out.println("Enter a number: ");
//    		number = input.nextInt();
//    		if (number == 0) {
//    			// break statement terminates the loop
//    			break;
//    			} // End if statement
//    		} // End of for statement
//    	} 
	
    public static void main(String[] args) {
    	int cnt, square, cube;
    	   for (cnt = 1; cnt < 300; cnt++) {
    		   if (cnt % 3 == 0) {
    			   continue;
    			   }
    		   square = cnt * cnt;
    		   cube = cnt * cnt * cnt;
    		   System.out.printf("\nSquare of %d is %d and Cube is %d", cnt, square, cube);
    		   }
    }
}  
    		
     
    
