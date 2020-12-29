public class constructor {
  int x; 
	
     public constructor() {
      System.out.println("Default");
      x = 5;
  }

  public static void main(String[] args) {
   constructor a = new constructor();
    System.out.println(a.x);
  }
}