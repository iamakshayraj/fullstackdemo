import java.util.*;

public class Switchpgm
{ 
	public static void main(String args[]) 
	{ 
		System.out.println("Enter your choice---"); 
		System.out.println("1 - Enter data"); 
		System.out.println("2 - View data"); 
		Scanner sc = Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) 
		{ 
		    case 1: 
				System.out.println("---DETAILS---"); 
				System.out.println("Enter Employee ID");
				System.out.println("Employee Name"); 
				System.out.println("Enter Designation");  
				Scanner em = Scanner(System.in);
		                int id = em.nextInt();
				String na= em.nextLine();
				String de= em.nextLine();
				
				break; 
		     case 2: 
				System.out.println("---Viewing Data----"); 
				System.out.println("Employee id"+id); 
				System.out.println("Employee Name"+na); 
				System.out.println("Designation"+de); 
				break; 
			default: 
				System.out.println("Invalid"); 
		} 
	} 
} 
