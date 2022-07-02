public class EmpUc5 {
	public static void main(String[] args) {
		final int FULLTIME = 1;
		final int PARTTIME = 2;
		int workingdayspermonth=20;
		
		int hour;
		int ispresent = (int) (Math.random() * 3);
		System.out.println(ispresent);

		

		
		switch (ispresent) {
		case FULLTIME:
			hour= 8;
			break;
		case PARTTIME:
			hour=4;
		    break;
		default:
			hour=0;
			
		}

		int wage = hour*workingdayspermonth; 
		System.out.println("Employee wage per month is"+wage);
	}
}