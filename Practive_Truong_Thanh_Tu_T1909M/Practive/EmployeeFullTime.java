package Practive;

public class EmployeeFullTime extends SalaryPoliey {
	float rate;

	public EmployeeFullTime() {
		super();
		this.rate = (float) 4;
	}
	public void setgetSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	float getSalary() {

		return this.baseSalary * this.rate;
	}
}
