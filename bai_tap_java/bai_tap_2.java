package bai_tap_java;
import java.util.Scanner;

public class bai_tap_2 {
	public static final String chuoi ="0123456789ABCDEFGHIJKLMNOQRSTUVXYZW";
	
	public static String doicoso(int x, int b) {
		StringBuilder sb = new StringBuilder();
		int i= 0;
		while (x > 0) {
			i = x%b;
			x /= b;
			sb.append(chuoi.charAt(i));
		}
		return sb.reverse().toString();
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
		System.out.println("Nhap vao co so can chuyen sang b");
		int b = nhap();
		System.out.print("Chuyen: "+ doicoso(n, b));
	}
}
