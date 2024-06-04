package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List al = new ArrayList();

		al.add(10);
		al.add("Chandan");
		al.add(10.5);
		al.add('a');
		al.add(true);

		// size()
		System.out.println(al);
		System.out.println("Number of elements in the arrayList " + al.size());

		// remove()
		al.remove(3);
		// al.remove('a');
		System.out.println(al);
		al.add(1, "hi");
		System.out.println(al);

		System.out.println(al.get(2));

		al.set(2, "Chandan.D.S");
		System.out.println(al);

		System.out.println(al.contains(10.5));

		System.out.println(al.isEmpty());

		// for loop

		/*
		 * System.out.println("Reading the data using for loop"); for(int i =0;
		 * i<al.size();i++) { System.out.println(al.get(i)); }
		 */

		// for each
		
		for(Object e:al) {
			System.out.println(e);
		}

	}

}
