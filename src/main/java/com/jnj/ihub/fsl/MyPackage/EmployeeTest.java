package MyPackage;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int i=0;
		char a=88;
		Employee Ashish=new Employee("Ashish");
		Ashish.setAge(33);
		for (int j=0; j<4; j++){
		if (i==0) System.out.println("I is equal to zero");
		i=i++;
		}
		for (int b=0;b<4;b++)
		{
		System.out.println("The ASCII value for Car 88 is "+a );
		a++;
		}
		Ashish.setDesignation("Software Quality Assurance Engineer");
		Ashish.setSalary(100000);
		Ashish.printEmpdetails();
		
		System.out.println("10>9 is "+ (10>9));
		
	}

}
