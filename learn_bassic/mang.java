package learn_bassic;

public class mang {
//	public static void main(String[] agrs) {
//	 int array1[] = new int[5];
//	 int array2[] =  new int[5];
//	 
//	 
//	 for(int i = 0; i <= 4; i++) {
//		 array2[4-i] =  array1[i];
//	 }
//	 
//	 for(int j = 0; j <= 4; j++) {
//		 System.out.println(array2[j]);
//	 }
//	}
	public static void main(String[] agrs) {
		int array1[]= new int[5];
		array1[0] = 0;
		array1[1] = 1;
		array1[2] = 2;
		array1[3] = 3;
		array1[4] = 4;
		int max = array1[0];
		for(int i = 0; i <= 4;i++ ) {
			if(max <= array1[i]) {
				max = array1[i];
			}
		}
		System.out.println("Max : " + max);
	}
}
