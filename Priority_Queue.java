import java.util.*;
@SuppressWarnings("unchecked")
//@SuppressWarnings("rawtypes")

class comp implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		else
			return 0;
	}
}

		
class Practise
{
	void show()
	{
		 PriorityQueue<Integer> pq=new PriorityQueue<>(new comp());
		
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);
		
		
		System.out.println("Top most element is "+pq.peek());
		
		pq.forEach((x)->System.out.println(x));
		
		System.out.println("After deletion of "+pq.peek());
		
		pq.poll();
		
		pq.forEach((x)->System.out.println(x));
	}
	public static void main(String []args)
	{
		
		Practise p=new Practise();
		p.show();	
		
	}
	
}
