package assign2;

import java.util.Scanner;

public class Employee {
		float sal;
		String name;
		int age;
		String desig;
		
		// TODO Auto-generated constructor stub
	
public Employee(String a,float b ,int c, String d)
		{
		
		 name=a;
		 sal=b;
		 age=c;
		 desig=d;
		}
	        

Scanner v= new  Scanner(System.in);
public void display()
{  
		
	
	System.out.println("employee name="+name);
	System.out.println("employee name="+sal);
	System.out.println("employee name="+age);
	System.out.println("employee name="+desig);
	
}

public void hike()
{   
	System.out.println("Enter increment ");
	int i =v.nextInt();
	System.out.println("Previous salary is"+sal);
	
	sal=sal+i;
	System.out.println("updated salary is"+sal);
		
}
}
