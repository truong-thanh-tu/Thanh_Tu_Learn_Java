package Abstract_Classes_vs_Interfaces;

public class TestShape_1 {
public static void main(String[] args) {
	  Shape_1 s1 = new Rectangle_1(1, 2);  // upcast
      System.out.println(s1);
      //Rectangle[length=1,width=2]
      System.out.println("Area is " + s1.getArea());
      //Area is 2.0

      Shape_1 s2 = new Triangle_1(3, 4);  // upcast
      System.out.println(s2);
      //Triangle[base=3,height=4]
      System.out.println("Area is " + s2.getArea());
      //Area is 6.0
}
}
