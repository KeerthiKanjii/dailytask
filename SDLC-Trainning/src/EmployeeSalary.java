import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int basicSalary = input.nextInt();

		double HRA;
		double DA;

		if (basicSalary <= 10000) {
			HRA = basicSalary * 0.20;
			DA = basicSalary * 0.8;
		} else if (basicSalary <= 20000) {
			HRA = basicSalary * 0.25;
			DA = basicSalary * 0.9;
		} else {
			HRA = basicSalary * 0.30;
			DA = basicSalary * 0.95;
		}

		int grossSalary = (int) (basicSalary + HRA + DA);
		System.out.println("Gross Salary: " + grossSalary);
	}
}