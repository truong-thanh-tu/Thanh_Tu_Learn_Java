package session;


public class session_6 {
	int customerID;
	String customerName;
	String customerAddress;
	int customerAge;
//	
//	public static void main(String[] args) {
//		session_6 objCustomer1 = new session_6();
//		
//		objCustomer1.customerID = 100;
//		objCustomer1.customerName="John";
//		objCustomer1.customerAddress="123Street";
//		objCustomer1.customerAge=30;
//		
//		System.out.println("Customer indentificationNumber :"+objCustomer1.customerID);
//		System.out.println("Customer Name :"+objCustomer1.customerName);
//		System.out.println("Customer Address :"+objCustomer1.customerAddress);
//		System.out.println("Customer Age :"+objCustomer1.customerAge);
//	}
	
	void changeCustomerAddress(String address) {
		customerAddress = address;
	}
	void displayCustomerInformation() {
		  System.out.println("Customer Identification Number: " + customerID);
		  System.out.println("Customer Name: " + customerName);
		  System.out.println("Customer Address: " + customerAddress);
		  System.out.println("Customer Age: " + customerAge);
	}
	
//	public static void main(String[] args) {
//	       session_6 objCustomer = new session_6();
//		   
//	       objCustomer.customerID = 100;
//		   objCustomer.customerName = "Jack";
//		   objCustomer.customerAddress = "123 Street";
//		   objCustomer.customerAge = 30;
//		   
//		   objCustomer.displayCustomerInformation(); 
//		   objCustomer.changeCustomerAddress("123 Fort, Main Street");
//		   objCustomer.displayCustomerInformation();
//	}
	int width;
	int height;
	
	session_6(){
		System.out.print("Contructor Invoked ...");
		width = 10;
		height = 10;
	}
//	public static void main (String[] args) {
//		session_6 objRec = new session_6();
//		
//	    System.out.println("Width: " + objRec.width);
//	    System.out.println("Height: " + objRec.height);
//	}
	
	String employeeName;
	int employeeAge;
	double employeeSalary;
	boolean maritalStatus;
	
	void displayEmployeeDetails() {
		  System.out.println("Employee Details");
		  System.out.println("================");
		  System.out.println("Employee Name: " + employeeName);
		  System.out.println("Employee Age: " + employeeAge);
		  System.out.println("Employee Salary: " + employeeSalary);
		  System.out.println("Employee MaritalStatus:" + maritalStatus);
	}
	
//	public static void main(String[] args) {
//		session_6 objEmp = new session_6();
//		objEmp.displayEmployeeDetails();
//	}
	
	session_6(int wid, int heig){
	    System.out.println("Parameterized Constructor");
	    width = wid;
	    height =heig;
	}
	void  displayDimensions () {
		System.out.println("Width: " +width);
		System.out.println("Heigth: " +height);
	}
	
	public static void main(String[] args) {
		session_6 objrec1 = new session_6(10,20);
		session_6 objrec2 = new session_6(6,9);
		
		 System.out.println("\nRectangle1 Details");
		 System.out.println("===================");
		 objrec1.displayDimensions();
		 System.out.println("\nRectangle2 Details");
		 System.out.println("===================");
		 objrec2.displayDimensions(); 
	}
}
