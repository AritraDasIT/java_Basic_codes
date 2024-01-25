

public class Main
{
	public static void main(String[] args) {
		
		// pre increment
		
		int a =10;
		
		int b = 0;
		
		b= ++a;              // 1) change the value -> 2) Use the value
		
		System.out.println(a);      // output : 11
		System.out.println(b);      // output : 11
		
		// Post increment
		
		int c= 10;
		int d= 0;
		
		d= c++;                // 1) Use the value -> 2) Change the value
		
		System.out.println(c);     // output: 11
		System.out.println(d);     // output  10
		
		
		
		
		
	}
}
