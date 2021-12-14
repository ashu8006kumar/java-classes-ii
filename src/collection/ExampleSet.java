package collection;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();

		s.add(2);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		for (Integer integer : s) {
			System.out.println(integer);
		} 
	}
}
