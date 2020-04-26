package QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	static ArrayList<SinhVien> arrSV = new ArrayList<SinhVien>();
	static SinhVien sv = new SinhVien();

	public static void arrangeSV(ArrayList<SinhVien> arrSV) {
		for (int i = 0; i < arrSV.size(); i++) {
			for (int j = 0; j < arrSV.size(); j++) {
				if (arrSV.get(i).getPoint() < arrSV.get(j).getPoint()) {
					SinhVien sv = new SinhVien();
					sv = arrSV.get(i);
					arrSV.set(i, arrSV.get(j));
					arrSV.set(j, sv);
				}
			}
		}

	}

	public static void showlistSV(ArrayList<SinhVien> arr) {
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).outputinforSV();
			System.out.println("*****************");
		}
	}

	public static void inputlistSV(int n) {
		for (int i = 0; i < n; i++) {
			SinhVien sv = new SinhVien();
			sv.InputInforSV();
			System.out.println("****************");
			arrSV.add(sv);
		}
	}

	public static void searchSV(ArrayList<SinhVien> arr, String name) {
		int j = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().lastIndexOf(name) > 0) {
				arr.get(i).outputinforSV();
				j = 1;
			}
		}
		if (j == 0) {
			System.out.println("Khong co sinh vien trong he thong");
		}
	}

	public static void main(String[] args) {
		try {
			boolean x = true;
			while (x) {
				System.out.println("***************Menu**************");
				System.out.println("Moi Ban Lua Chon               : ");
				System.out.println("1 Nhap Danh Sach Sinh Vien     :");
				System.out.println("2 Hien Thi Danh Sach Sinh Vien :");
				System.out.println("3 Sap Xep Danh Sach Sinh Vien  :");
				System.out.println("4 Tim Kiem Sinh Vien           :");
				System.out.println("5 Thoat                        :");
				int chose;

				chose = sv.inputinteger();
				switch (chose) {
				case 1: {
					System.out.println("Ban Hay Nhap So Sinh Vien Co Trong Danh Sach ");
					int n = sv.inputinteger();
					inputlistSV(n);
					break;
				}
				case 2: {
					showlistSV(arrSV);
					break;
				}
				case 3: {
					arrangeSV(arrSV);
					showlistSV(arrSV);
					break;
				}
				case 4: {
					System.out.println("Moi Ban Nhap Ten Sinh Vien Can Tim");
					String name;
					name = sv.inputstring();
					searchSV(arrSV, name);
					break;
				}
				case 5: {
					x = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + chose);
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
