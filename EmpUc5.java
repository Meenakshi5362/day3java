
public class EmpUc5 {
	public static void main(String[] args) {
		final int FULLTIME = 1;
		final int PARTTIME = 2;
		final int wageperhr = 20;

		int emphour = 0;
		int empwage = 0;
		int totalempwage = 0;
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");

		final int workingdayspermonth = 20;

		for (int day = 0; day < workingdayspermonth; day++) {

			int isEmpPresent = (int) (Math.random() * 3);

			switch (isEmpPresent) {

			case FULLTIME:
				System.out.println("Employee is present");
				emphour = 8;
				break;

			case PARTTIME:
				System.out.println("Employee is working part-time");
				emphour = 4;
				break;

			default:
				System.out.println("Employee is absent");
				emphour = 0;
				break;

			}
			empwage = emphour * wageperhr;
			totalempwage = totalempwage + empwage;
			System.out.println("Employee wage is" + empwage);

		}
		System.out.println("Employee monthlywage is" + totalempwage);

	}
}
