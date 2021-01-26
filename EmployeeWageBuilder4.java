
public class EmployeeWageBuilder4 {

	EmployeeWageBuilder4() {
		System.out.println("Welcome to Employee Wage Computation");
		}

	void Attendance(){
		int empCheck=(int) Math.floor(Math.random() * 10) % 2;
		if(empCheck == 0)
			System.out.println("Employee is Absent");
		else
			System.out.println("Employee is Present");
	}

	public static void main(String args[]){
	EmployeeWageBuilder4 Emp= new EmployeeWageBuilder4();
	Emp.Attendance();
	}
}
