interface RBI { 
		void loan(); 
		public default void display() 
	      }
  static void print() 
	{ 	System.out.println("sbi loan 8%"); 
        } 
	interface RBI2
		 { 
			void loanRecover(); 
        	 } 
   class SBI implements RBI,RBI2 
		{ 
			public void loan() 
				{       
				  System.out.println("SBI class"); 
                                } 
			public void loanRecover()
           		 { 
				System.out.println("Sbi class loan recover"); 
            		} 
class interface 
	{ 
		public static void main(String args[])
 		{ 
			System.out.println("Interface demo");
		 }
	}