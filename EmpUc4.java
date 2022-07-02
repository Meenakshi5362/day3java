public class EmpUc4 {
	public static void main(String[] args) {
		final int FULLTIME = 1;
		final int PARTTIME = 2;
		
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

		int wage = hour*20; 
		System.out.println("Employee wage is"+wage);
	}
}
