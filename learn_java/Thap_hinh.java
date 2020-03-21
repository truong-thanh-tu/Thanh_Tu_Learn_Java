package learn_java;
import java.util.Scanner;
public class Thap_hinh {
	public static void main(String[] args) {
//		int number = 1;
//		while(number <= 10) {
//			
//			for(int i = 1; i <= number; i++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//			number++;
//		}
		
//		int number = 10;
//	while(number >= 1) {
//		
//		for(int i = 1; i <= number; i++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
//		number--;
//	}
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		size = sc.nextInt();
		for(int i = 1; i <= size; i++) {
			if(i % 2 == 0) {
				for(int j = 1; j <= size; j++) {
					if( j == 1 || j == size) {
						System.out.print("  ");
					}
					else {
						System.out.print("* ");
					}
				}
			}
			else {
				for(int k = 1; k <= size; k++) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
//		int number = 1;
//		while(number <= 5 ) {
//		 for(int i = 1; i <= 5-number; i++) {
//		System.out.print("   ");
//		}
//		 for(int i = 1; i <= number; i++) {
//				System.out.print("  *");
//				}
//			System.out.println("");
//			number++;
//		}sdad2
//		

//		int number = 5;
//		while(number >= 1 ) {
//		 for(int i = 1; i <= 5-number; i++) {
//		System.out.print("   ");
//		}
//		 for(int i = 1; i <= number; i++) {
//				System.out.print("  "+i);
//				}
//			System.out.println("");
//			number--;
//		}
		
//		int number = 1;
//		while(number < 5) {
//			for(int i = 1; i <= 5-number; i++) {
//				System.out.print("   ");
//			}
//		     for(int j = 1; j <= number; j++) {
//				System.out.print("  "+j);
//			}
//		     for(int k = 6; k <= k+number; k++) {
//				System.out.print("  ");
//				}
//		}

	}
}
