package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
     
		Set <String> s= new HashSet<String>();
		s.add("apple");
		s.add("Orange");
		s.add("grapes");
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("apple"));
	}

}
