package Practive;

public class EmployeePartime extends SalaryPoliey {
	float rate;

	public EmployeePartime() {
		super();
		this.rate = (float) 2.5;
	}
	public void setgetSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	float getSalary() {
		return this.baseSalary * this.rate;
	}

}
