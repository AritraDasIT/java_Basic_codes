
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		if(a==b)
		{
		    System.out.println("a and b eqaual");
		}
		
		else{
		    
		    if(a>b)
		    {
		        System.out.println("a is big");
		    }
	        else
		    {
		        System.out.print("b is big");
		    }
		}
	
		
	}
}
