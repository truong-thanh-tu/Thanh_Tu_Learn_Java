package java_16;
public class TestPerson_2_10 {
	public static void main(String[] args) {
		
		 /* Test Student class */
	      Student_2_10 s1 = new Student_2_10("Tan Ah Teck", "1 Happy Ave");
	      s1.addCourseGrade("IM101", 97);
	      s1.addCourseGrade("IM102", 68);
	      s1.printGrades();
	      //Student: Tan Ah Teck(1 Happy Ave) IM101:97 IM102:68
	      System.out.println("Average is " + s1.getAverageGrade());
	      //Average is 82.5

	      /* Test Teacher class */
	      Teacher_2_10 t1 = new Teacher_2_10("Paul Tan", "8 sunset way");
	      System.out.println(t1);
	      //Teacher: Paul Tan(8 sunset way)
	      String[] courses = {"IM101", "IM102", "IM101"};
	      for (String course: courses) {
	         if (t1.addCourse(course)) {
	            System.out.println(course + " added");
	         } else {
	            System.out.println(course + " cannot be added");
	         }
	      }
	      
	      for (String course: courses) {
	         if (t1.removeCourse(course)) {
	            System.out.println(course + " removed");
	         } else {
	            System.out.println(course + " cannot be removed");
	         }
	      }
	}
}