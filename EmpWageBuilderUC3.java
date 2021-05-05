package javapractice;

public class EmpWageBuilderUC3 {
	public static void main(String args[]) {
	
	// constants	
	int EMP_RATE_PER_HOUR = 20;
	int IS_FULL_TIME = 1;
	int IS_PART_TIME = 2;
	
	//variables
	int empHrs = 0;
	int empWage = 0;
	
	
	int empCheck = (int) Math.floor(Math.random() * 10 )% 3;
	
	if (empCheck == IS_FULL_TIME)
		
		empHrs =8;
	else if 
	(empCheck == IS_PART_TIME)
		empHrs = 4;
	else
		empHrs = 0;
	
	empWage = empHrs * EMP_RATE_PER_HOUR;
		
	System.out.println(" Daily Wage is:" + empWage );
	
	
	}
	

}
