package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
     
		Set <String> s= new HashSet<String>();
		Set <String> s1= new HashSet<String>();
		s1.add("red");
		s1.add("blue");
		s1.add("white");
		s.add("apple");
		s.add("Orange");
		s.add("grapes");
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("apple"));
		s.addAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		
	}

}
