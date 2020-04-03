package Practive;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * create two objects EmployeeFullTime is name full and EmployeePartime is name
		 * part
		 */
		EmployeeFullTime full = new EmployeeFullTime();
		EmployeePartime part = new EmployeePartime();
		// Ask user to Input base salary for each object

		System.out.print("Input base salary: ");
		long baseSalary = input.nextLong();
		System.out.println("You want to check salary for: ");
		System.out.println(" 1 : Employee Full Time");
		System.out.println(" 2 : Employee Part Time");
		System.out.println(" 3 : Employee Part Time and Employee Full Time");
		int num = input.nextInt();
		switch (num) {
		case 1: {
			// Print salary for EmployeeFullTime
			full.setgetSalary(baseSalary);
			System.out.print(" salary: " + full.getSalary());
			break;
		}
		case 2: {
			// Print salary for EmployeePartime
			part.setgetSalary(baseSalary);
			System.out.print(" salary: " + part.getSalary());
			break;

		}
		case 3: {
			
			full.setgetSalary(baseSalary);
			part.setgetSalary(baseSalary);
			System.out.print(" salary part time: " + part.getSalary());
			System.out.print(" salary full time: " + full.getSalary());
			break;
		}

		}

	}

}
