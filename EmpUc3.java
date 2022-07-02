package empuc3;

public class empuc3 {
	public static void main(String[] args){
		int PRESENT = 1;
		int PARTTIME =2;
		int empwageperhr = 20;
		int empworkinghrperday =8;
		int parttimehrs=4;
		
		
		int ispresent = (int)(Math.random() *3);
		System.out.println(ispresent);
		
		if(ispresent == PRESENT) {
			System.out.println("EMPLOYEE IS PRESENT");
		}
			 else if(ispresent == PARTTIME){
			System.out.println("EMPLOYEE IS parttime");
			 }
			 else {
				 System.out.println("EMPLOYEE IS absent");
			 }
		     
				int empwage = (int)(empwageperhr*empworkinghrperday);
		
	 
	if(ispresent == PRESENT) {
			System.out.println("EMPLOYEE wage is"+empwage);
		}
	else if(ispresent == PARTTIME){
		System.out.println("EMPLOYEE WAGE is"+parttimehrs*empwageperhr);
		
		 }
			 else {
			System.out.println("EMPLOYEE wage is 0");
			 }
	}
}
	

 
