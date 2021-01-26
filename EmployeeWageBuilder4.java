
public class EmployeeWageBuilder4 {

	int WagePerHour=20;
	int NoOfHours=0;
	int month=20;
	int day=1;
	int MaxHours=100;

	EmployeeWageBuilder4() {
		System.out.println("Welcome to Employee Wage Computation");
		}

	void Attendance(){

		while(day <= month){
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
		day++;
		if(MaxHours <= NoOfHours)
				break;
		}
	}

	void Wage(){
		Attendance();

		int Payment = WagePerHour * NoOfHours;
		System.out.println("Employee wage is "+Payment);
	}

	public static void main(String args[]){
	EmployeeWageBuilder4 Emp= new EmployeeWageBuilder4();
	Emp.Wage();
	}
}
