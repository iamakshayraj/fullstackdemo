import java.util.Scanner;
public class mark
{
    public static void main(String args[])
    {
	Scanner a = new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark = a.nextInt();
        //int mark=59;

	System.out.println("Your Grade is ");
        if(mark>=90)
        {
            System.out.println("O");
        }
	
        else if(mark > 85 && mark <=89)
        {
            System.out.println("A");
        }
	
        else if(mark > 65 && mark <=85)
        {
            System.out.println("B");
        }
        else if(mark>45 && mark<=65)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
    }
}