package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add("Z");
		al.add("Y");
		al.add("X");
		al.add("D");
		al.add("E");
		al.add("F");
		
		System.out.println(al);
		
		List aldp = new ArrayList();
		
		aldp.addAll(al);
		System.out.println(aldp);
		
		aldp.removeAll(al);
		System.out.println(aldp);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
