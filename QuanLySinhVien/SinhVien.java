package QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class SinhVien {
	private String name;
	private int year;
	private String address;
	private double point;
	
	public String inputstring() {
		 Scanner scan = new Scanner(System.in);
		 return scan.nextLine();
	}
	public int inputinteger() {
		 Scanner scan = new Scanner(System.in);
		 return scan.nextInt();
	}
	public double inputdouble() {
		 Scanner scan = new Scanner(System.in);
		 return scan.nextDouble();
	}
	public void InputInforSV() {
		
		System.out.println("Moi ban nhap ten       :  \n");
		 name    = inputstring();
		 System.out.println("Moi ban nhap nam sinh :  \n");
		 year    = inputinteger();
		 System.out.println("Moi ban nhap dia chi  :  \n");
		 address = inputstring();
		 System.out.println("Moi ban nhap dien     :  \n");
		 point = inputdouble();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	
	public void outputinforSV() {
		System.out.println("Sinh vien ten: "+getName()+"\n"
				          +"Nam sinh     : "+getYear()+"\n"
				          +"Dia chi      : "+getAddress()+"\n"
				          +"Diem         : "+getPoint());
	}
//	public void arrangeSV( ArrayList<SinhVien> arrSV ) {
//		for (int i = 0; i < arrSV.size(); i++) {
//			for (int j = 0; j < arrSV.size(); j++) {
//				if (arrSV.get(i).getPoint() < arrSV.get(j).getPoint()) {
//					SinhVien sv = new SinhVien();
//					sv = arrSV.get(i);
//					arrSV.set(i, arrSV.get(j));
//					arrSV.set(j, sv);
//				}
//			}
//		}
//       		
//	}
}
