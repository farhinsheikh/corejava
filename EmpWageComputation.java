public class EmpWageComputation {
	public final int IS_PART_TIME=1;
	public final int IS_FULL_TIME=2;
	public final int EMP_RATE_PER_HOUR=20;
	public final int NUM_OF_WORKING_DAYS=20;
	public final int MAX_HRS_IN_MONTH=100;

	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWageComputation emp=new EmpWageComputation();
		emp.getEmpWage();
	}

	public void getEmpWage(){
		//variables
		int empHrs=0;
		int empWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		//Computation
		while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
		int empCheck=(int) Math.floor(Math.random() * 10) %3;
			switch (empCheck) {
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
         		empHrs=8;
					break;
				default:
					empHrs=0;
			}
				totalEmpHrs +=empHrs;
				empWage=empHrs * EMP_RATE_PER_HOUR;
				System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
				int totalEmpWage=totalEmpHrs * EMP_RATE_PER_HOUR;
				System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}

