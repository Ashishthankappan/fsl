package MyPackage;

public class MyFirstJavaPgm
{

 int Age=10;
 String Name = "Name1";
 double Height=6.5;
 
	
//enum Listofvalue {a,b,c}

enum listof {a,b,c}
listof strText;

public static void main (String []args)

{
System.out.println("Hello world");

MyFirstJavaPgm test= new MyFirstJavaPgm();

System.out.println("Name:" + test.Name+"; Age: "+test.Age+ "; Height:" + test.Height);
test.getAge(1);

test.strText=MyFirstJavaPgm.listof.a;
System.out.println(test.strText);




}

public void getAge(int a){
	
	System.out.println("Age from method - "+ Age );
	System.out.println("Just printing what was passed "+ a );
}


}


abstract class TestingDup
{
	}