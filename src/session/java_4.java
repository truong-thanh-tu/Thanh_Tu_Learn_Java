package session;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UnknownFormatConversionException;
public class java_4 {
	public static void main(String[] args) {
		char c1 ='0';
		char c2 ='A';
		char c3;
//		System.out.println((int)c1);
//		System.out.println((int)c2);
//		c3 = 97;
//		System.out.println(c3);
//		System.out.println((char)97);
		
//		c3 = (char)(c1+c2);
//		System.out.println(c3);
//		System.out.println(c1+c2);
//		System.out.println((char)(c2+c1));
		
//		c3 = (char)(c1+5);
//		System.out.println(c3);
//		System.out.println(c1+5);
//		
//		for(int codeNum = 'a';codeNum <= 'z';++codeNum) {
//			System.out.println((char)codeNum + ": " +codeNum);
//		}
//		

//		char hexChar ='a';
//		int dec;
//		if(hexChar >= '0' && hexChar <= '9') {
//			dec = hexChar - '0';
//		}
//		else if (hexChar >= 'A'&& hexChar <= 'F') {
//			dec = hexChar -'A' +10;
//		}
//		else if (hexChar >= 'a'&& hexChar <= 'f') {
//			dec = hexChar -'a' +10;
//		}
//		else {
//			dec = -1;
//			System.out.println("Invaid hex char");
//		}
//		System.out.println(hexChar+": "+dec);
		
//		String str ="Java is cool!";
//		System.out.println(str.length());
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(5));
//		
//		String amotherStr ="Java is COOL!";
//		System.out.println(str.equals(amotherStr));
//		System.out.println(str.equalsIgnoreCase(amotherStr));
//		System.out.println(amotherStr.equals(str));
//		System.out.println(amotherStr.equals(str));
		
//		String inStr = "12345";
//		int number = Integer.parseInt(inStr);
//		System.out.print(number);
		
//		String inStr = "55.66";
//		float aFloat = Float.parseFloat(inStr);
//		double aDouble = Double.parseDouble("1.2345");
//		aDouble = Double.parseDouble("1.2e-3");
		
//		String msg ="Hello, world";
//		char msgChar ;
//		for (int idx = 0; idx < msg.length();++idx) {
//			msgChar = msg.charAt(idx);
//		}
//		String boolStr ="123";
//		boolean done = Boolean.parseBoolean(boolStr);
//		boolean valid = Boolean.parseBoolean("false");
//		
//		System.out.println(done);
//		System.out.println(valid);
		
//		String iStr;
//		int inStrlen;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter a String : ");
//		iStr = sc.next();
//		inStrlen = iStr.length();
//		
//		System.out.print("The reverse is: ");
//		for (int i = inStrlen -1; i >= 0; --i) {
//			System.out.print(iStr.charAt(i));
//		}
//		System.out.println();
//		sc.close();
		
//		int[] mark = new int[5];
//		mark[0] = 97;
//		mark[1] = 98;
//		mark[2] = 99;
//		mark[3] = 100;
//		mark[4] = 101;
//		System.out.println(mark[0]);
//		System.out.println(mark[1]+mark[2]);
//	}
//		
//	int[] marks = {74,43,58,60,90,64,70};
//	int sum = 0;
//	int sumSq = 0;
//	double mean =0, stdDev=0;
//	
//	for (int i = 0; i <marks.length;++i) {
//		sum += marks[i];
//		sumSq +=marks[i]*marks[i];
//		}
//		
//		  mean = (double)sum / marks.length; 
//		  stdDev = Math.sqrt((double)sumSq /marks.length - mean*mean);
//	
//	System.out.println("Mean is: "+(double) Math.round(mean * 100) / 100);
//	System.out.println("Standard deviation is:"+(double) Math.round(stdDev * 10) / 10);
		
//		int numItems;
//		int [] items;
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter the number of items: ");
//		numItems = in.nextInt();
//		
//		items = new int[numItems];
//		
//		if(items.length > 0) {
//			System.out.print("Enter the value of all items: ");
//			for (int i = 0; i < items.length;i++) {
//				items[i] = in.nextInt();
//			}
//		}
//		System.out.print("The values are: [");
//		for (int j= 0; j<items.length; ++j) {
//			if(j == 0) {
//				System.out.print(items[0]);
//			}else {
//				System.out.print(","+items[j]);
//			}
//		}
//		System.out.println("]");
//		in.close();
		
//		int numStudents;
//		int[]grades;
//		int[] bins = new int[10];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the number of students: ");
//		numStudents = sc.nextInt();
//		
//		grades = new int[numStudents];
//		
//		for (int i = 0; i<grades.length;i++) {
//			System.out.print("Enter the grade for student"+(i+1)+ ":");
//			grades[i]=sc.nextInt();
//		}
//		
//		System.out.print(Arrays.toString(grades));
//		
//		for(int garade :grades) {
//			if( garade == 100) {
//				++bins[9];
//			}else {
//				++bins[garade/10];
//			}
//		 }
//		System.out.println(Arrays.toString(bins));
//		
//		for(int binIdx = 0; binIdx <bins.length;++binIdx) {
//			if(binIdx != 9) {
//				System.out.printf("%2d - 3%d: ",binIdx*10,binIdx*10+9);
//			}
//			else {
//				System.out.printf("%2d - %3d: ", 90,100);
//			}
//			
//			for(int itemNo = 0; itemNo < bins[binIdx];++itemNo) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		int binMax = bins[0];
//		for (int binIdx = 1; binIdx < bins.length;++binIdx) {
//			if(binMax < bins[binIdx])binMax = bins[binIdx];
//		}
//		for(int level = binMax; level > 0; --level) {
//			for(int binIdx = 0; binIdx < bins.length;++binIdx) {
//				if(bins[binIdx] >= level) {
//					System.out.print(" * ");
//				}
//				else {
//					System.out.print("   ");
//				}
//			}
//				System.out.println();
//			}
//			for(int binIdx = 0; binIdx < bins.length;++binIdx) {
//				System.out.printf("%3d -%3d", binIdx*10,(binIdx != 9)? binIdx*10 + 9: 100);
//			}
//			System.out.println();
//			sc.close();
		
//		int[][] grid = new int[4][3];
//		int numRows = grid.length;
//		int numCols = grid[0].length;
//		
//		for(int row = 1 ;row < numRows;++row) {
//			for (int col = 0; col <numCols; ++col) {
//				grid[row][col] = row*numCols+col+1;
//			}
//		}
//		for(int row = 0; row <numRows; ++row) {
//			for(int col = 0; col < numCols; ++col) {
//				System.out.printf("%3d",grid[row][col]);
//			}
//			System.out.println();
//		}
		
//		int[][] grid = {
//				{1,2},
//				{3,4,5},
//				{6,7,8,9}
//		};
//		
//		for(int y = 0; y < grid.length; ++y) {
//			for (int x = 0; x < grid[y].length;++x) {
//				System.out.printf("%2d", grid[y][x]);
//			}
//			System.out.println();
//		}
//		int[][] grid1 = new int[3][];
//		 grid1[0] = new int[2];
//		 grid1[1] = new int[3];
//		 grid1[2] = new int[4];
//		 
//		 for(int y = 0; y <grid1.length; ++y) {
//			 for(int x = 0; x < grid1[y].length;++x) {
//				 System.out.printf("%2d", grid[y][x]);
//			 }
//			 System.out.println();
//		 }
		
//		double r = 1.1, area,area2;
//		area = getArea(r);
//		System.out.println("area is "+ (double) Math.round(area * 100) / 100);
//		area2 =getArea(2.2);
//		System.out.println("area  2 is "+ (double) Math.round(area * 100) / 100);
//		
//		System.out.println("area  3 is "+ (double) Math.round(getArea(3.6) * 100) / 100);

//		int a = 6, b =9, max, min;
//		max = max(a,b);
//		min = min(a,b);
//		
//		System.out.println(max + ","+min);
//		System.out.println(max(5,8));
//		System.out.println(min(5,8));
//		int number;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a positive integer: ");
//     	number = sc.nextInt();
//		
//		if(isMagic(number)) {
//			System.out.println(number + " is a magic number");
//		}
//		else {
//			System.out.println(number + " is not a magic number");
//		}
//		sc.close();
		
//		int numItems;
//		int[] items;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the number of items: ");
//		numItems = sc.nextInt();
//		
//		items = new int[numItems];
//		
//		if(items.length >0) {
//			System.out.print("Enter the value of all items: ");
//			for (int i = 0; i < items.length; i++) {
//				items[i] =sc.nextInt();
//			}
//		}
//		System.out.println("The values are : ");
//		print(items);
//		System.out.println("The min is: " + min(items));
//		System.out.println("The sum is: " + sum(items));
//		System.out.println("The average is: " + average(items));
//		
		
		int[] testArray = {9,9,8,2,3};
		System.out.println("In caller, before calling the method, array is : " + Arrays.toString(testArray));
		
		increment(testArray);
		
		System.out.println("In caller, after calling the method, array is : " + Arrays.toString(testArray));
	}


	//	public static int max(int number1, int number2) {
//		if(number1 > number2) {
//			return number1;
//		}
//		else {
//			return number2;
//		}
//	}

	//	public static int min(int number1, int number2) {
//		return (number1 < number2) ? number1: number2;
//	}

	//	public static double getArea(double radius) {
//		return radius*radius*Math.PI;
//	}
	
//	public static boolean isMagic(int number) {
//		boolean isMagic = false;
//		while (number > 0) {
//			int digit = number % 10;
//			if (digit == 8) {
//				isMagic = true;
//				break;
//			}
//			number/=10;
//		}
//		return isMagic;
//	}
//	public static void print(int[] array) {
//		System.out.print("[");
//		for (int j = 0; j < array.length; j++) {
//			System.out.print((j == 0)?array[j] : "," +array[j]);
//		}
//		System.out.println("]");
//	}
//	
//	public static int min(int[] array) {
//		int min = array[0];
//		for (int j = 0; j < array.length; j++) {
//			if(array[j] < min) {
//				min = array[j];
//			}
//		}
//		return min;
//	}
//	public static int sum(int[] array) {
//	int sum = 0;
//	for(int item: array) {
//		sum += item;
//	 }
//	return sum;
//	}
//	public static double average(int[] array) {
//		return (double)(sum(array))/array.length;
//				
//	}
	
	public static void increment(int[] array) {
		System.out.println("Inside method, before operation, array is : " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inside method, before operation, array is : " + Arrays.toString(array));
		}
	}
}
		
		
