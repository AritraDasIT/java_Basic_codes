import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	     
	    System.out.print("Enter first number: ");
	    int a= sc.nextInt();
	    
	    System.out.print("Enter Second number: ");
	    int b = sc.nextInt();
	    
	    int result=sc.nextInt();
	    
	    switch(result){
	        
	        case 1: System.out.print("sum =" + (a+b));
	        break;
	        
	        case 2: System.out.print(" subtract = " + (a-b));
	        break;
	        
	        case 3: System.out.print(" Mul = " +  (a*b));
	        break;
	        
	        case 4: 
	            if(b==0){
	                
	                System.out.print("Invalid");
	                
	            }
	            
	            else
	            {
	                System.out.print("Division" + (a/b));
	            }
	            
	        break;
	        
	        case 5: 
	            if(b==0){
	                
	                System.out.print("Invalid");
	                
	            }
	            
	            else
	            {
	                System.out.print("Modulus" + (a%b));
	            }
	            
	        break;
	        
	        default: System.out.print("Invalid input");
	    }
	    
	    
	    
	    
	    
	    
	    
		
	}
}
