import java.util.ArrayList;                     // for ArrayList
import java.util.Collections;           // for sorting
public class Main
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();            // Declaring the  Integer ArrayList
		ArrayList<String>  list2 = new ArrayList<>();            // Declaring the String  ArrayList
		ArrayList<Double>  list3 = new ArrayList<>();           // Declaring the Float ArrayList
		
		// Printing the Empty  ArrayList
        System.out.println("Array 1:" + list1);
        System.out.println("Array 2:" + list2);
        System.out.println("Array 3:" + list3);
        
        // add new elements 
        
        
        list1.add(1);
        list1.add(12);
        list1.add(25);
        
        list2.add("AD");
        list2.add("BC");
        list2.add("CA");
        
        list3.add(2.2);
        list3.add(1.22);
        list3.add(85.5);
        
        // Printing the  ArrayList after adding elements
        
        System.out.println("Array 1:" + list1);
        System.out.println("Array 2:" + list2);
        System.out.println("Array 3:" + list3);
        
        // Get element 
        
        Double element3 = list3.get(2);        // pass the index of the element 
        String element2 = list2.get(1);
        int element1 = list1.get(0);
        
        System.out.println(element3);
        System.out.println(element2);
        System.out.println(element1);
        
        // add element at any index 
        
        list1.add(1,87);               // list.add(index,element)
        list2.add(0,"bg");
        System.out.println(list1);
        System.out.println(list2);
        
        // Set element 
        
        list1.set(2,45);
        System.out.println(list1);    // replace element at given index (index,element)
        
        // Delete element at any index 
        
        list2.remove(2);
        System.out.println(list2);
        
        // Size of the ArrayList
        
        int size = list1.size() ;
        System.out.println(size);
        
        //loops 
        
        for(int i =0 ; i<list1.size();i++)
        {
            System.out.print(list1.get(i));
        }
        
        System.out.println();
        
        // sorting
        
        Collections.sort(list1);
        System.out.println(list1);         // print sorted array
        
        


	}
}

 /*  Output

Array 1:[]
Array 2:[]
Array 3:[]
Array 1:[1, 12, 25]
Array 2:[AD, BC, CA]
Array 3:[2.2, 1.22, 85.5]
85.5
BC
1
[1, 87, 12, 25]
[bg, AD, BC, CA]
[1, 87, 45, 25]
[bg, AD, CA]
4
1874525
[1, 25, 45, 87]

	*/
