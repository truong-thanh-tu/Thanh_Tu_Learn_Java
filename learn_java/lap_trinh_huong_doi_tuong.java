package learn_java;

public class lap_trinh_huong_doi_tuong {
	public static void main(String[] args) {
//		System.out.println("OOP");
		Student studenone = new Student();
		studenone.setBrithday(1994);
		studenone.setCode("S001");
		studenone.setName("John");
		System.out.println();
//		studenone.ShowInfor();
		 int age = studenone.getAge();
		 System.out.println(age);
	}
}
