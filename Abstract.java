abstract class RBI{
	abstract void loan();	
		  }
class SBI extends RBI{
			void loan()
				{
					System.out.println("SBI interest is 8% ");

				}	
			}
 class ICICI extends RBI{
			void loan()
				{
					System.out.println("ICICI interst is 9%");

		  		 }
			}
public class Abstract{
			public static void main(String args[])
				{
					System.out.println ("---ABstract---");
					SBI r = new SBI();
					r.loan();
				}
		}
