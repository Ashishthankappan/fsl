package MyPackage;



public class MyClass {
	
	public static void main(String args[])
	{
	String StrA="Ashish";
    String StrB="Advik";
    String StrC="Radhika";
    int a=10, b=5;
    
    
    
    
    
    int count=prntSpouse(StrC,StrA, a,b);
    System.out.println(count);
    count=prntSon(StrB,StrA, a,b);
    System.out.println(count);
	}
   
public static int prntSpouse(String Str1, String Str2, int a, int b )
{
	int count= a+b;
	if (Str1.equals(Str2))
	{
		System.out.println("The strings are equal");
		
	} else
	{
		System.out.println("The strings are not equal");
		System.out.println("Length of "+Str1.length());
		System.out.println(Str1.substring(0, Str1.length()));
		for (int x=0; x<Str1.length();x=x+1){
			System.out.println(Str1.substring(0, x));
		}
	}
	
	System.out.println(Str1+ " "+Str2);
	return (count);
	
}

public static int prntSon(String Str1, String Str2, int a, int b )
{
	System.out.println(Str1+ " " + Str2);
	int count= a-b;
	
	return (count);
}
	}

