package javapractice;

public class EmpWageBuilderUC8
{
	// Constants	
			public static final int IS_FULL_TIME = 2;
			public static final int IS_PART_TIME = 1;
			
		
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingdays, int maxHoursPerMonth)
	{
		int empHrs = 0;
		int totalWorkingDays=0;
		int toatalEmpHrs = 0;
		
	
		
		
		//variables
		
		
		while (toatalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingdays){
		
			totalWorkingDays++;
		
		int empCheck = (int) Math.floor(Math.random() * 10 )% 3;

	    switch (empCheck) {
	    
	    
	    case IS_FULL_TIME:
			empHrs = 8;
			break;
			case IS_PART_TIME:
			empHrs = 4;
			break;
		     default:
			empHrs = 0;
	    }
		
			
	    toatalEmpHrs += empHrs;
	    System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" +empHrs);
		
		}
		int totalEmpWage = toatalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company : " +company+ "is:" + totalEmpWage);
		return totalEmpWage;
}
		
      public static void main(String args[]) {
    	  computeEmpWage("DMart", 20, 2, 10);
    	  computeEmpWage("Reliance", 50, 3, 20);
      
	}

      }
