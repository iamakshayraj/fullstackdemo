public class loop{

		public static void main(String args[])
		  {

			System.out.println("-----loop demo---");
			System.out.println("-----for loop---");
			
			for(int i=0;i<5;i++)
				{
					System.out.println("hai");
				}

			System.out.println("-----while loop---");
			int i=0;
			while (i < 5)
			 {

  				System.out.println("hello");
  				i++;
			 }
			System.out.println("-----Switch---");
			String sign = "+";
			switch (sign) 
			{
  
 				case "+": System.out.println("Add");
 				   break;
  
 				case "-":System.out.println("Sub");
    					break;

				case "*":System.out.println("Multiplication");
    						break;
 				 default:System.out.println("Wrong command");
			}

				System.out.println("-----Do While Loop---");
				int j = 0;
				do {
 					 System.out.println(j);
 					 j++;
				   }
				while (j < 5);
			
		}


}
