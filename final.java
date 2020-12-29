class String 
{ 
    public static void main (String args[]) 
    { 
        String s= "good"; 
   	s= s.concat("morning");
	System.out.println(s.toUpperCase());
	System.out.println("String length = " + s.length());
        System.out.println("Character at 3rd position = "
                           + s.charAt(3)); 
	System.out.println("Changing to lower Case " + 
                            word1.toLowerCase());
        
        System.out.println("Substring " + s.substring(3));
    }
}