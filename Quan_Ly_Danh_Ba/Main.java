package Quan_Ly_Danh_Ba;

import java.util.Scanner;
;

public class Main {
	static ContactList contactlist = new ContactList();
	static Scanner input = new Scanner(System.in);
	static String name, phone;

	private static void searchPhone() {
		System.out.println("Moi ban nhap ten nguoi dung    : ");
		name = input.next();
		contactlist.searchPhone(name);
	}

	private static void addPhone() {
		System.out.println("Moi nhap ten nguoi dung : ");
		 name = input.nextLine();
		System.out.println("Moi ban nhap so dien thoai moi : ");

		 phone = input.next();
		contactlist.addPhone(name, phone);
	}

	private static void updatePhone() {
		System.out.println("Moi ban nhap ten nguoi dung    : ");
		name = input.next();
		System.out.println("Moi ban nhap so dien thoai moi : ");
		phone = input.next();
		contactlist.updatePhone(name, phone);
	}

	private static void Print() {
		contactlist.Print();
	}

	private static void removePhone() {
		System.out.println("Moi ban nhap ten nguoi dung muon xoa :");
		name = input.next();
		contactlist.removePhone(name);
	}

	static void menu() {
		System.out.print("1. Them So Lien Lac \n" + "2. Xoa So Lien Lac \n" + "3. Thay Doi Lien Lac \n"
				+ "4. Tim Kiem Lien Lac \n" + "5. Hien Thi Lien Lac \n" + "6. Thoat\n");
	}

	public static void main(String[] args) {
		int choice;
		menu();
		while (true) {
			System.out.println("Moi ban chon 1 muc: ");
			choice = input.nextInt();
//			input.nextInt();
			switch (choice) {
			case 1: {
				addPhone();
				break;
			}
			case 2: {

				removePhone();
				break;
			}
			case 3: {
				updatePhone();
				break;
			}
			case 4: {
				searchPhone();
				break;

			}
			case 5: {
				Print();
				break;
			}
			case 6:
				return;

			}

		}
	}
}
