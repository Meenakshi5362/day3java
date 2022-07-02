public class EmpUc2 {
	
	public static void main(String[] args){
		int PRESENT = 1;
		int empwageperhr = 20;
		int empworkinghrperday =8;
		
		
		int ispresent = (int)(Math.random() *2);
		System.out.println(ispresent);
		
		if(ispresent == PRESENT) {
			System.out.println("EMPLOYEE IS PRESENT");
		}
			 else {
			System.out.println("EMPLOYEE IS ABSENT");
			 }
		     
				int empwage = (int)(empwageperhr*empworkinghrperday);

		
	   if(ispresent == PRESENT) {
			System.out.println("EMPLOYEE wage is"+empwage);
		}
			 else {
			System.out.println("EMPLOYEE wage is 0");
			 }
	
	
	}
}