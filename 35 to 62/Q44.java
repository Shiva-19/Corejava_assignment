import java.util.Scanner;
class Faculty{
		private int facultyId;
		private double salary;
		Faculty()
		{
			salary = 0;
		}
		void input(int a)
		{
			this.facultyId=a;
			//this.salary = b;
		}
		void setSalary(double salary){
		this.salary=salary;
		}
		void printSalary()
		{
			System.out.println("salary is :" +salary);
		}
}

class FullTimeFaculty extends Faculty{
					private double basicSalary;
					private double allowance;
					void input(int facultyId, int basicSalary, int allowance)
					{
						super.input(facultyId);
						this.basicSalary=basicSalary;
						this.allowance=allowance;
						setSalary(basicSalary + allowance);
					}
				}
class PartTimeFaculty extends Faculty{
					private double workingHours;
					private double ratePerHour;
					
					void input(int facultyId, double workingHours ,double ratePerHour)
					{
						super.input(facultyId);
						this.workingHours=workingHours;
						this.ratePerHour=ratePerHour;
						setSalary(workingHours*ratePerHour);
					}
	}
			
	class Q44{
			public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				FullTimeFaculty obj1 = new FullTimeFaculty();
				obj1.input(1,20000,1300);
				PartTimeFaculty obj2 = new PartTimeFaculty();
				obj2.input(2,8,400);
				obj1.printSalary();
				obj2.printSalary();
			}
		}		

					