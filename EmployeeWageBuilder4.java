
public class EmployeeWageBuilder4 {

	int WagePerHour=20;
	int NoOfHours;

	EmployeeWageBuilder4() {
		System.out.println("Welcome to Employee Wage Computation");
		}

	void Attendance(){
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;
		// empCheck=0 Employee is Absent
		// empCheck=1 Employee is Present
		// empCheck=2 Employee is Part Time

		if(empCheck == 0){
			System.out.println("Employee is Absent");
			NoOfHours=0;
			}
		else if(empCheck == 1){
			System.out.println("Employee is Present");
			NoOfHours=8;
			}
		else{
			System.out.println("Employee is Part Time");
			NoOfHours=4;
			}
	}

	void DailyWage(){
		Attendance();

		int Payment = WagePerHour * NoOfHours;
		System.out.println("Daily wage is "+Payment);
	}

	public static void main(String args[]){
	EmployeeWageBuilder4 Emp= new EmployeeWageBuilder4();
	Emp.DailyWage();
	}
}
