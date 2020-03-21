package learn_java;
import java.util.Scanner;
public class game_di_tim_an_so {
public static void main(String[] args) {
	
	final int Max_Number = 100;
	final int Min_Number = 1;
	int range =(Max_Number -Min_Number)+1;
	int secreNumber = secreNumber = (int)(Math.random()*range) +Min_Number;;
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	int yourNumber = 0;
	System.out.println("Tro choi di tim so bi an.");
	System.out.println("Huong dan: May tinh se tao ra mot so ngay nhien cong viec cua ban la di tim ra no bang cach nhap so ");
    do {
	 while(secreNumber != yourNumber) {
	 	System.out.println("Nhap so cua ban (1 - 100)");
		yourNumber = sc.nextInt();
		 
		if(yourNumber > secreNumber) {
			System.out.println("So cua ban lon hon so bi an");
		}
		else if(yourNumber < secreNumber) {
			System.out.println("So cua ban nho hon so bi an");
		}
		else {
			System.out.println("Chinh xac");
		}
		count++;
	}
  }while(count < 10);
   if(count >10) {
	   System.out.println("Ban da that bai");
	   System.out.printf("Sau: %d",count);
   }
   else {
	   System.out.println("Ban da chien thang");
	   System.out.println("Diem cua ban: "+count);
   }
	sc.close();
  }
}
