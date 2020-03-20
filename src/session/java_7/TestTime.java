package session;

public class TestTime {
	public static void main(String[] args) {
		Time t1 = new Time(1,2,3);
		System.out.println(t1);
		Time t2 = new Time();
		System.out.println(t2);
		
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println(t1);
		System.out.println("Hour is : "+t1);
	}
}
