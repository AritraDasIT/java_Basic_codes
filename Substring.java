
public class Main
{
	public static void main(String[] args) {
		
		String sentence = "I am Aritra";
		
		String name = sentence.substring(5,sentence.length());     //   ( 5,(length-1) )
		
		System.out.println(sentence.length());
		
		System.out.print(name);
	}
}
