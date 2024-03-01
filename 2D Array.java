import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rows: ");
		int row= sc.nextInt();
		System.out.println("Enter Columns: ");
		int column = sc.nextInt();
		 
		
		int number[][]=new int[row][column]; // declare 2D array
		
		System.out.println("Enter the 2D Array elements:  ");
		
		//Input of Array
		
		for(int i=0 ; i<row;i++)     // outer loop for rows
		{
		    for(int j=0 ; j<column;j++)     // Inner loop for column
		    {
		        number[i][j]=sc.nextInt();
		    }
		}
		
		//output
		
		System.out.println("The 2D array: ");
		
		for(int i=0 ; i<row;i++)     // outer loop for rows
		{
		    for(int j=0 ; j<column;j++)     // Inner loop for column
		    {
		        System.out.print(number[i][j]+" ");
		    }
		    
		    System.out.println();
		}
		
		
	}
}
