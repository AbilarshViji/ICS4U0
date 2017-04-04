
public class FullTimeEmployee extends EmployeeInfo {
	private double annualSalary;

	public FullTimeEmployee(int eN, String fN, String lN, int wL, double dR, double aSal) {
		super(eN, fN, lN, wL, dR);
		annualSalary = aSal;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}
