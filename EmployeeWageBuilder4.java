import java.util.*;
public class EmployeeWageBuilder4 {

	int WagePerHour;
	int NoOfHours=0;
	int MaxDays;
	int Day=1;
	int MaxHours;
	String company;

	EmployeeWageBuilder4(){}
	EmployeeWageBuilder4(String s) {
		System.out.println("Welcome to Employee Wage Computation");
		}

	void InDetails(){
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Following Details");
	System.out.println("Company Name");
	company=Sc.nextLine();
	System.out.println("Wage per Hour");
	WagePerHour=Sc.nextInt();
	System.out.println("Maximum Hours");
	MaxHours=Sc.nextInt();
	System.out.println("Maximum Days");
	MaxDays=Sc.nextInt();

	}

	void WageCalc(){

		while(Day <= MaxDays){
			int empCheck=(int) Math.floor(Math.random() * 10) % 3;
			// empCheck=0 Employee is Absent
			// empCheck=1 Employee is Present
			// empCheck=2 Employee is Part Time

		switch (empCheck) {
			case 1:
				NoOfHours+=8;
				break;
		case 2:
				NoOfHours+=4;
				break;
			}
		Day++;
		if(MaxHours <= NoOfHours)
				break;
		}
	}

	void Wage(){
		InDetails();
		WageCalc();

		int Payment = WagePerHour * NoOfHours;
		System.out.println("Employee total wage is "+Payment);
	}

	public static void main(String args[]){
	EmployeeWageBuilder4 Emp1= new EmployeeWageBuilder4("String");
	EmployeeWageBuilder4 Emp2= new EmployeeWageBuilder4();
	Emp1.Wage();
	Emp2.Wage();
	}
}
