package javapractice;

public class EmpWageBuilderUC1 {
	public static void main(String args[]) {
	
	int IS_FULL_TIME = 1;
	//double empcheck = Math.floor(Math.random() * 10 % 2;
    //  double empcheck = Math.random()(max-min+1)+min;
	// Use of typecasting to covert "Double" Value to Int Value

	int empcheck = (int) (Math.random()*(1-0+1)+0); 	
	System.out.println(empcheck);

	if (empcheck == IS_FULL_TIME)
	System.out.println("Employee is Present");
	else
		System.out.println("Employee is Absent");
	 
	
	}
	

}
