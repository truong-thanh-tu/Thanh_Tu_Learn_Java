package learn_java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ung_dung_ATM {
	public static void main(String[] args) {
	
	DecimalFormat formatter = new DecimalFormat("#,###");
	System.out.println(formatter.format(150000000));
	final int five_hundred_thousand = 500000;
	final int two_hundred_thousand  = 200000;
	final int one_hundred_thousand  = 100000;
	final int fifty_thousand        = 50000;
	final int tweenty_thousand      = 20000;
	final int ten_thousand          = 10000;
	
	int money = 0;
	
	int FIVE_HUNDRED_THOUSAND  = 0;
	int TOW_HUNDRED_THOUSAND   = 0;
	int ONE_HUNDRED_THOUSAND   = 0;
	int FIFTY_THOUSAND         = 0;
	int TWEENTY_THOUSAND       = 0;
	int TEN_THOUSAND           = 0;
	
	Scanner sr = new Scanner(System.in);
	do {
		System.out.print("Your's money: ");
		money = sr.nextInt();
	}while (money % 10000 != 0);
	
		if(money >= five_hundred_thousand) {
			FIVE_HUNDRED_THOUSAND = money /five_hundred_thousand;
			money = money -(FIVE_HUNDRED_THOUSAND*five_hundred_thousand);
			System.out.println("Menh gia 500.000: "+FIVE_HUNDRED_THOUSAND);
		}
		if(money >= two_hundred_thousand) {
			TOW_HUNDRED_THOUSAND = money / two_hundred_thousand;
			money = money -(TOW_HUNDRED_THOUSAND*two_hundred_thousand);
			System.out.println("Menh gia 200.000: "+TOW_HUNDRED_THOUSAND);
		}
		if(money >= one_hundred_thousand) {
			ONE_HUNDRED_THOUSAND = money /one_hundred_thousand;
			money = money -(ONE_HUNDRED_THOUSAND*one_hundred_thousand);
			System.out.println("Menh gia 100.000: "+ONE_HUNDRED_THOUSAND);
		}
		if(money >= fifty_thousand) {
			FIFTY_THOUSAND = money /fifty_thousand;
			money = money -(FIFTY_THOUSAND*fifty_thousand);
			System.out.println("Menh gia 50.000: "+FIFTY_THOUSAND);
		}
		if(money >= tweenty_thousand) {
			TWEENTY_THOUSAND = money /tweenty_thousand;
			money = money -(TWEENTY_THOUSAND*tweenty_thousand);
			System.out.println("Menh gia 20.000: "+TWEENTY_THOUSAND);
		}
		
		if(money >= ten_thousand) {
			TEN_THOUSAND = money /ten_thousand;
			money = money -(TEN_THOUSAND*ten_thousand);
			System.out.println("Menh gia 10.000: "+TEN_THOUSAND);
		}
		
	
  }
}