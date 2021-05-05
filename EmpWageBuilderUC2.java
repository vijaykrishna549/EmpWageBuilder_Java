package javapractice;

public class EmpWageBuilderUC2 {
	public static void main(String args[]) {
	
	// constants	
	int EMP_RATE_PER_HOUR = 20;
	int IS_FULL_TIME = 1;
	
	//variables
	int empHrs = 0;
	int empWage = 0;
	
	
	int empcheck = (int) (Math.random()*(1-0+1)+0); // Use of typecasting to covert "Double" Value to Int Value
	System.out.println(empcheck);
//  double empcheck = Math.random()(max-min+1)+min;
	if (empcheck == IS_FULL_TIME)
		empHrs =8;
	else
		empHrs = 0;
	
	empWage = empHrs * EMP_RATE_PER_HOUR;
		
	System.out.println(" Daily Wage is:" + empWage );
	
	
	}
	

}
