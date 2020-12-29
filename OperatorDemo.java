class OperatorDemo {
  public static void main(String args[]) {
  
    int a = 10, b = 5, c= 2, d = 7;
    System.out.println("Arithemetic Operations");
 
    System.out.println("ADD" + (a + b));
    System.out.println("SUB " + (a - b));
    System.out.println("MUL = " + (a * b));
    System.out.println("DIV = " + (a / b));
    System.out.println("MOD = " + (a % b));
    System.out.println("Logical Operations");

     	System.out.println("a > b && c > d");
     	System.out.println((a > b) && (c > d));
	System.out.println("a > b || c > d");
	System.out.println((a < b) || (c > d));
    	System.out.println("a != b");
	System.out.println(a != b);


	System.out.println("Relational Operations");
    	System.out.println("equal" + a == b);
	System.out.println("not equal" +a != b); 
	System.out.println("GT"+a > b); 
	System.out.println("LT"+a < b);  
	System.out.println("GE"+a >= b); 
	System.out.println("LE"+a <= b); 

  }

}
