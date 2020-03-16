package session;

import java.util.Scanner;
public class java_3 {
//	public static void main(String[] args) {
//		int lowerbound =1, upperbound = 1000;
//		int sumodd = 0;
//		int sumeven =0;
//		int absdiff;
//		
//		int number  = lowerbound;
//		while (number <=  upperbound) {
//			if(number % 2 == 0) {
//				sumeven += number;
//			}
//			else {
//				sumodd += number;
//			}
//			++number;
//		}
//		if(sumodd > sumeven) {
//			absdiff = sumodd  - sumeven;
//		}
//		else {
//			absdiff = sumeven - sumodd;
//		}
//		System.out.println("The sum odd numbers from "+lowerbound + "to" +upperbound +"is" +sumodd);
//		System.out.println("The sum even numbers from "+lowerbound + "to" +upperbound+"is" +sumeven);
//		System.out.println("The sum absolute difference between the two sums is  "+absdiff);
//	}
	
//	public static void main(String[] args) {
//		int num1;
//		double num2;
//		String str;
//		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter an integer: ");
//		num1=in.nextInt();
//		System.out.print("Enter a floating  poin: ");
//		num2 = in.nextDouble();
//		System.out.print("Enter a string: ");
//		str = in.next();
//		
//		System.out.printf("%s, Sum of %d & %.2f is %.2f%n",str,num1,num2,num1+num2);
//		
//		in.close();
//	}
	
//	public static void main (String[] args) {
//		Scanner in = new Scanner (System.in);
//		
//		System.out.print("Enter a string (With space): ");
//		
//		String str = in.nextLine();
//		System.out.printf("%s%n",str);
//		in.close();
//	}
	
//	public static void main(String[] args){
//		final double Tax_rate_above_20k =0.1;
//		final double Tax_rate_above_40k = 0.2;
//		final double Tax_rate_above_60k = 0.3;
//		
//		int taxableIncome;
//		double taxPayable;
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter the taxable income: $");
//		taxableIncome = in.nextInt();
//		
//		 if(taxableIncome <= 20000) {
//			 taxPayable = 0;
//		 }
//		 else if (taxableIncome <= 40000) {
//			 taxPayable = (taxableIncome -20000) * Tax_rate_above_20k;
//		 }
//		 else if (taxableIncome <= 60000) {
//			 taxPayable = 20000* Tax_rate_above_40k;
//		 }
//		 else {
//			 taxPayable = 20000 * Tax_rate_above_20k + 2000*Tax_rate_above_40k +(taxableIncome -60000)*Tax_rate_above_60k;
//		 }
//		 System.out.printf("The income tax payable i: $%.2f%n",taxPayable);
//		 in.close();
//		
//		}
	
//	public static void main(String[] args) {
//		int secretNumber;
//		int nuberIn;
//		int trialNumber = 0;
//		boolean done = false;
//		Scanner in = new Scanner(System.in);
//		
//		secretNumber = (int)( Math.random()*100);
//		 while (! done) 
//		 {
//			 ++trialNumber;
//			 System.out.print("Enter your guess between 0 and 99: ");
//			 nuberIn = in.nextInt();
//			 if(nuberIn == secretNumber) {
//			 System.out.println("Congratulation");
//			 done = true;
//			 }
//			 else if (nuberIn < secretNumber) {
//				 System.out.println("Try height");
//			 }
//			 else {
//				 System.out.println("Try lower");
//			 }
//		 }
//		 System.out.println("You got in "+ trialNumber +"trials");
//		 in.close();
//	}
	
//	public static void main(String[] args) {
//		int size;
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter the size");
//		size = in.nextInt();
//		for(int row = 1 ;row <= size;row++) {
//			for(int col = 1; col <= size;col++) {
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}
//		
//	}
	
//	public static void main(String[] args) {
//		int upperbound = 100;
//		int maxFactor;
//		for (int number = 2; number <= upperbound; ++number) {
//			maxFactor = ( int )Math.sqrt(number);
//			for (int factor= 2;factor <= maxFactor;++factor) {
//				if(number % factor == 0) {
//					System.out.println(number + " is Not a prime");
//					break;
//				}
//			}
//		}
//	}
	
//	public static void main (String[] args) {
//		int upperbound = 100;
//		for (int number = 2; number <= upperbound; ++number) {
//			int maxFactor = (int) Math.sqrt(number);
//			boolean isPrime = true;
//			for (int factor = 2; factor <= maxFactor;++factor) {
//				if(number % factor == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime) System.out.println(number + "is a prime");
//		}
//	}
//}
	
//	public static void main(String[] args) {
//	  	int upperbound= 100;
//	  	for(int number = 2;number <= upperbound; ++number) {
//	  		int maxFactor = (int)Math.sqrt(number);
//	  		boolean isPrime = true;
//	  		int factor = 2;
//	  		while(isPrime && factor <= maxFactor) {
//	  			if(number % factor == 0) {
//	  				isPrime = false;
//	  			}
//	  			++factor;
//	  		}
//	  		if(isPrime) {
//	  			System.out.println(number + " is a prime");
//	  		}
//	  	}
//	}
	
	public static void main(String[] args) {
		int [][] testArray_1 = {
				{1,2,3,4},
				{5,6,7,8},
				{5,3,2,4}
		};
		 int magicNuber = 8;
		 boolean found = false;
		 for (int i = 0; i < 3;++i ) {
			 for (int j = 0; j < 4;++j) {
				 if (testArray_1[i][j] == magicNuber) {
					 found = true;
				 }
			 }
		 }
		 System.out.println("Magic number"+(found ? "found" :"Not found"));
	}
}
