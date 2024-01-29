
public class Main
{
	public static void main(String[] args) {
	    
	    StringBuilder sc = new StringBuilder("HELLO");
	    
	    System.out.println(sc);
	    
	    for(int i=0 ; i<sc.length()/2;i++)
	    {
	        int front= i ;                      // initial value of 1st index {0}
	        int back= (sc.length()-1-i);         // initial value of  lst index {5-1-0}=4
	        
	        char frontChar= sc.charAt(front);     //Acess 1st Character 
	        char backChar= sc.charAt(back);       // Acess lst Character
	        
	        sc.setCharAt(front,backChar);       // set character at any index  (index , character)
	        sc.setCharAt(back, frontChar);
	    }
	    
	    System.out.println("Reverse string");
	    
	    System.out.println(sc);



	}
}
