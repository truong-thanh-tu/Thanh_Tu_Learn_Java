package Practive_T1909M;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBCConnection.DemoConnection;

public class MainPriactive {
	public static void addStudent(String masv, String tensv, String diachi, String phone) {
		Connection conn = ConnectJDBC.getJDBCConnection();
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into sinhvien(masv,tensv,diachi,phone) values('" + masv + "','" + tensv + "','"
					+ diachi + "','" + phone+"'"+")" ;
			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public static void SeveStudent() {
		Connection conn = DemoConnection.getJDBCConnection();

		try {
			Statement stmt = conn.createStatement();
		String sql = "BACKUP DATABASE qlsv" + 
				"TO DISK = 'C:\';";
			int rs = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
  }
	public static void displayStudent() {

		Connection conn =ConnectJDBC.getJDBCConnection();

		try {
			Statement stmt = conn.createStatement();

			final String SQL = "select * from sinhvien";

			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				String masv = rs.getString("masv");
				String tensv = rs.getString("tensv");
				String diachi = rs.getString("diachi");
				String phone = rs.getString("phone");
				System.out.println(masv + " " + tensv+" "+diachi+" "+phone);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
   public static int inputInteger() {
	   Scanner scan = new Scanner(System.in);
	   
	   return scan.nextInt();
   }
   public static String inputString() {
	   Scanner scan = new Scanner(System.in);
	   
	   return scan.nextLine();
   }
	public static void main(String[] args) {
		int choise;
		while(true) {
			System.out.println("********Menu********");
			System.out.println(": 1 Add student records      |");
			System.out.println(": 2 Display student records  |");
			System.out.println(": 3 Save                     |");
			System.out.println(": 4 Exit                     |");
			
			choise = inputInteger();
			switch (choise) {
			case 1: {
				System.out.println("Enter information for styden: ");
				System.out.println("Sydent ID: ");
				String masv = inputString();
				System.out.println("Student Name :");
				String tensv = inputString();
				System.out.println("Address :");
				String diachi = inputString();
				System.out.println("Phone : ");
				String phone = inputString();
				addStudent(masv, tensv, diachi, phone);
				
			}
			case 2: {
				displayStudent();
				
			}
			case 3:{
				SeveStudent();
			}
			case 4:{
				break;
			}
			default:
				
			}
		}
		
		
	}
}
