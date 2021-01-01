package assign2;
import java.util.*;

public class salhike2 {


		public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Employee name");
			String name=s.nextLine();


			System.out.println("Enter Age");
			int age=s.nextInt();
			s.nextLine();
			System.out.println("Enter Designation");
			String designation=s.nextLine();
			System.out.println("Enter salary");
			int salary=s.nextInt();

			emp2 is=new emp2(name,age,salary,designation);

			System.out.println("1 display ");
			System.out.println("2 raise salary");
			int a=s.nextInt();
			int i;
			while(a==1 || a==2) {
			if (a==1)
			{
			is.display();
			}
			else if (a==2)
			{
			System.out.println("Current Salary  " + salary );
			System.out.println("Enter increment value ");
			i=s.nextInt();
			is.salary(i);
			}

			System.out.println("Click 1 To display Details");
			System.out.println("Click 2 To raise salary");a=s.nextInt();
			}
		}

		}

		}
