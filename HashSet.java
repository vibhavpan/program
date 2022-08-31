import java.util.*;
@SuppressWarnings("unchecked")
//@SuppressWarnings("rawtypes")

		
class Practise
{
	public static void main(String []args)
	{
		HashSet<Integer> lhs=new HashSet<>(5);
		
		//add elements in hashset
		lhs.add(10);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		
		//make iterator
		Iterator<Integer> i=lhs.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
	}
	
}
