package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Emp ashish = new Emp(1, "Ashish", "ashish@xyx.com");
		Emp ram = new Emp(2, "Ram", "ashish@xyx.com");
		Emp ashish1 = new Emp(1, "Ashish", "ashish2@xyx.com");
		Set<Emp> empset = new HashSet<>();
		empset.add(ashish);
		empset.add(ram);
		empset.add(ashish1);

		for (Iterator<Emp> iterator = empset.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

}
