package collection;
//This java file is inside package named collection inside src folder.
import java.util.*;       
//importing all classes from java's util library.

public class SetTheory
{
	public static void main(String[] args)     
   //main function declaration. 
	{
		HashSet<String> firstSet = new HashSet<String>();      
		//Creating HashSet of type String to store the data.
		
		firstSet.add("Light");
		firstSet.add("Night");
		firstSet.add("Music");
		
		HashSet<String> secondSet = new HashSet<String>();      
		//Creating another HashSet of type String to store the data.
		
		secondSet.add("Phone");
		secondSet.add("Book");
		secondSet.add("Pen");
		secondSet.add("Writer");
		
		firstSet.addAll(secondSet);
		
		Iterator<String> listFirst=firstSet.iterator();         
		System.out.println("Elements of the First Set :- ");
		while(listFirst.hasNext())    
		{
			System.out.println(listFirst.next());        
		}
		
		System.out.println();       
		
		Iterator<String> listSecond=secondSet.iterator();        
		System.out.println("Element of the Second Set :- ");
		while(listSecond.hasNext())     
		{
			System.out.println(listSecond.next());        
		}
		
	}    

}    
