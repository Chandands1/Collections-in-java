package linkedList;

import java.util.LinkedList;

public class Test4 {
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add("Chandan");
		l.add(10.22);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		l.remove(0);
		System.out.println(l);
		
		l.add(0, "Java");
		System.out.println(l);
		System.out.println(l.get(3));
		
		l.set(3,"ram");
		System.out.println(l);
		
	}

}
