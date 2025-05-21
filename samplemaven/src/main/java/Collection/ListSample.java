package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {

		List<String> l= new ArrayList<String>();
		l.add("apple");
		l.add("orange");
		l.add("banana");
		l.add("apple");
		l.set(1, "grapes");
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.contains("apple"));
		System.out.println(l.isEmpty());
		System.out.println(l.indexOf("apple"));
		System.out.println(l.lastIndexOf("apple"));
		l.remove(2);
		System.out.println(l);
		System.out.println(l.size());
	}

}
