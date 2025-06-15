// Write a Java Program to reverse an array of characters of size 05. Initialize the character array to "HELLO". 




public class Main{
    
    public static void main(String args[])
    {
        char arr[]={'A' , 'R' , 'I' , 'T' ,'R', 'A'};
        
        System.out.println("Original Array");
        
        for(char c: arr)
        {
             System.out.print(c +" ");
        }
        
        int n= arr.length;
        
        for(int i=0;i<n/2;i++)
        {
            char temp;
            
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
         System.out.println("\n\nReversed Character Array:");
        
        for( char c: arr)
        {
            System.out.print(c+" ");
        }
    }
}
