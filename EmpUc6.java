
public class EmpUc5 {
	public static void main(String[] args) {
		final int FULLTIME = 1;
		final int PARTTIME = 2;
		final int wageperhr = 20;
		final int workingdayspermonth = 20;
		final int maxworkinghours =100;

		int emphour = 0;
		int totalemphrs = 0;
		int totalworkingdays = 0;
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");

		
		while (totalemphrs <= maxworkinghours && totalworkingdays < workingdayspermonth) {
			totalworkingdays++;
		}
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
			
			totalemphrs += emphour;
			System.out.println("DAY:"+totalworkingdays+" Emp Hr:" +emphour);
			

		}
		int totalempwage=wageperhr * totalemphrs;
		System.out.println("Employee working hours" + totalemphrs);
		System.out.println("Employee monthlywage is" + totalempwage);

	}
}
