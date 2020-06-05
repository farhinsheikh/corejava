import java.util.Scanner; 

class Employee {

public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Employee Wage Computation Program\n"); 
	System.out.println("How many companies are there: "); 
	int size = sc.nextInt();
	CompanyEmpWage[] cp = new CompanyEmpWage[size]; 
	for(int i =0; i < size; i++){
	System.out.println("Enter details for company "+(i+1));
	System.out.println("Enter the wage per hour of your company:");
	int wage = sc.nextInt();
	System.out.println("Enter the number of working day in a month :"); 
	int days = sc.nextInt();
	System.out.println("Enter the number of working hours in a day:");
	int hours = sc.nextInt();
	cp[i] = new CompanyEmpWage(wage, days, hours);
}
	int i=0;
	for (CompanyEmpWage p : cp){ i++;
	System.out.println("Total Wage for Company "+i+" is :"+ p.totalWage);
	}
}
}
class CompanyEmpWage{ 
	int wage;
	int days; 
	int hours;
	int totalWage;
	CompanyEmpWage(int wage, int days, int hours){ this.wage = wage;
	this.days = days; this.hours = hours;
	this.totalWage = (wage * days * hours);
}
}
