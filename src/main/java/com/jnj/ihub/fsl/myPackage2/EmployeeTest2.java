package myPackage2;

public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPackage.Employee Second = new MyPackage.Employee("Ashish");
		
		Second.printEmpdetails();
		
		int a, b,  x;
		int [] y= {1,2,3,4,5,6,7};
		boolean c;
		a=10;
		b=10; 
		
		for (int z: y)
		{
			System.out.println(z);
		}
		
		x= (a==b)? 1:0;
		System.out.println("x = " +x);
		
		c= Second instanceof MyPackage.Employee;
		System.out.println(c);	
	}

}
