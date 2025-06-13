//print all prime numbers between 10 and 100
public class Main{
    
    public static void main(String args[])
    {
        int i,j;
        
        for(i=10;i<101;i++)
        {
            for(j=2;j<i;j++)
            {
                if((i%j)==0)
                {
                    break;
                }
            }
            
            if(j==i)
            {
                System.out.println(i);
            }
        }
    }
}
