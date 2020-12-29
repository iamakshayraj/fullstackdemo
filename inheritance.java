

class one 
{ 
	public void print1() 
	{ 
		System.out.println("hai"); 
	} 
} 

class two extends one 
{ 
	public void print2() 
	{ 
		System.out.println("good"); 
	} 
} 

class three extends two 
{ 
	public void print1() 
	{ 
		System.out.println("morning"); 
	} 
} 

 
public class inheritance
{ 
	public static void main(String args[]) 
	{
		three g = new print1(); 
		g.print1(); 
		g.print2(); 
		g.print3(); 
	} 
} 
