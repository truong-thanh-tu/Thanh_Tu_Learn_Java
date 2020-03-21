package bai_tap_java;

import java.util.Scanner;

public class bai_tap_3 {
	public static int tinh(int x) {
		int sum = 0;
		int a;
		while(x>0) {
			a = x%10;
			x /= 10;
			sum = sum + a;
		}
		return sum;
	}
	
	public static int nhap() {
		Scanner input = new Scanner(System.in);
		int n =  0;
		boolean check = false;
		while (!check) {
			
			try {
				n = input.nextInt();
				check = true;
			}
			catch (Exception e) {
				System.out.print("Ban hay nhap so! hay nhap lai ...");
				input.nextLine();
			}
		}
		return n;
	}
	public static void main(String[] args ) {
		System.out.println("Nhap n");
		int n= nhap();
	
		System.out.print("Sum: "+ tinh(n));
	}
}
