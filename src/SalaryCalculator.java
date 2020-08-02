
public class SalaryCalculator {

	public static double grossSalary(double hoursPerWeek,double moneyPerHour) {
		
		double result = hoursPerWeek*moneyPerHour*52;
		return result;
		
	}
	
	public static void main(String[] args, double hoursPerWeek, double moneyPerHour) {
		
		double salary = grossSalary(hoursPerWeek = 40, moneyPerHour = 100);
		
		System.out.println(salary);
	}

}
