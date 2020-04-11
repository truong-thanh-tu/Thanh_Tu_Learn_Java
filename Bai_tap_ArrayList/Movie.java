package Bai_tap_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Perform{

}
public class Movie {
	public static void main(String[] args) {
		List<String> Movie = new ArrayList<String>();
		boolean check;
		int num;
		String name;
		
		Scanner input = new Scanner(System.in);
		Handle handle = new Handle();
		
		
		
		System.out.println("Chuong trinh cho phep thuc hien.");
		System.out.println("1: Them phim moi.");
		System.out.println("2: Danh sach cac bo phim yeu thich. ");
		System.out.println("3: Chinh sua ten phim da co.");
		System.out.println("4: Xoa di mot bo phim khoi danh sach yeu thich.");
		System.out.println("5: Tim kiem ten phim trong danh ssach yeu thich.");
		num = input.nextInt();

		switch (num) {
		case 1: {
			System.out.println("Them phim moi : ");
			Movie.add(handle.temperaturestring());
		    for (int i = 0; i < Movie.size(); i++) {
				System.out.println(Movie.get(i));
			}
		break;
		}
		case 2: {
			check = Movie.isEmpty();
			if(check) {
				for (int i = 0; i < Movie.size(); i++) {
					System.out.println(i+" la: "+Movie.get(i));
				}
				
			}
			else {
				System.out.println("Danh sach dang trong");
				System.out.println("Ban can nhap ten phim vao: ");
				Movie.add(handle.temperaturestring());
			}
			break;
		}
		case 3:{
			int a;
		  
			System.out.println("Ban muon thay doi vi tri nao: ");
			a = input.nextInt();
			
			System.out.println("Ban muon thay doi tua phim: ");
			name = input.nextLine();
			
			Movie.set(a,name);
			break;
		}
		case 4:{
		
			System.out.println("Ban Muon xoa phim nao: ");
			name = input.nextLine();
			Movie.remove(name);
			break;
		}
		case 5:{
			System.out.println("Ban co the tim ten phim yeu thich theo index: ");
			name = Movie.get(1);
			System.out.println("Ten phim yeu thich cua  ban: "+name);
			break;
		}
		default:
			throw new IllegalArgumentException("Ban da chon sai ");
		}
	}
}
