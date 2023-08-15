package SortingAndSearching;

import java.util.*;

public class QueueExample {
	
	public static void main(String...args)
	{
	Queue<Integer> str=new LinkedList<Integer>();
	str.add(1);
	str.add(2);
	str.add(3);
	str.add(7);
	reversQueue(str);
	print(str);
	
	
	}

	private static void print(Queue<Integer> str) {
		// TODO Auto-generated method stub
		while(str.size()!=0)
		{
			System.out.print(str.remove()+" ");
		}
		return;
	}

	private static void reversQueue(Queue<Integer> str) {
		if(str.size()==0)
		{
			return;
		}
		
		int a=str.remove();
		reversQueue(str);
		str.add(a);
		
	}	

}
