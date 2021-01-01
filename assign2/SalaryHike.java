package assign2;

import java.util.*;

public class SalaryHike {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Employee e1 = new Employee("raj",10000,22,"HR");
		Employee e2=new Employee("akshay",30000,33,"CEO");
		Scanner a = new Scanner(System.in);
	
		
		
		
		System.out.println(" 1- Display 2- Hike");
		int s= a.nextInt();
		while(s==1 || s==2) {
		{
			if(s==1)
			{
			e2.display();
			e1.display();
			
			}
						
			else if(s==2)
			{
	    	e1.hike();
	    	e2.hike();
	    	
			}
			

			System.out.println(" 1- Display 2- Hike ");
			s= a.nextInt();
		
		}
	}
	}}


