package learn_java;

import java.util.Calendar;

public class Student {
	public String name;
	public String code;
	public int birthday;
	
	public void setName(String vName) {
		this.name = vName;
	}
	public void setCode(String vCode) {
		this.code = vCode;
	}
	public void setBrithday(int vBirthday) {
		this.birthday = vBirthday;
	}
	public String getName() {
		return this.name;
	}
	public String getCode() {
		 return this.code;
	}
	public int getBrithday() {
		 return this.birthday;
	}
	public void ShowInfor() {

		System.out.println("Birthday : "+ this.getBrithday());
		System.out.println("Code     : "+ this.getCode());
		System.out.println("Name     : "+ this.getName());
	}
	public int getAge() {
		int age = 0;
		Calendar now = Calendar.getInstance();
		
		age =now.get(Calendar.YEAR)-getBrithday();
		
		return age;
	}
}
