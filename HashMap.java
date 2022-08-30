import java.util.*;
@SuppressWarnings("unchecked")
//@SuppressWarnings("rawtypes")

		
class Practise
{
	public static void main(String []args)
	{
		//make a linked Hash Map with key ->integer and key string
		LinkedHashMap<Integer,String> lhm =new LinkedHashMap<>(5)
		{
			//remove items if more than map size based on order of insertion
			
			protected boolean removeEldestEntry(Map.Entry e)
			{
				return size()>5;
			}
		};
		
    //add items using put method
		lhm.put(1,"A");
		lhm.put(2,"B");
		lhm.put(3,"C");
		lhm.put(4,"D");
		lhm.put(5,"E");
		lhm.put(6,"F");
		lhm.put(8,"H");
		lhm.put(7,"V");
		
		lhm.forEach((k,v)->System.out.println(k+" "+v));
		
    //access values using get
		System.out.println(lhm.get(6));
		System.out.println(lhm.get(4));
		System.out.println(lhm.get(5));
		
		lhm.forEach((k,v)->System.out.println(k+" "+v));
	}
	
}
