package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleArrayList {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("Ashish"); // 0
		l.add("Mukesh");// 1
		l.add("Mukesh");// 2
		System.out.println(l.size());
		System.out.println(l.contains("Ashish"));// == .equals
		l.get(1); // array[index]
		l.indexOf("Mukesh");
		// add , remove size , add(index , value) ,
		// contains , indexOf
		// isEmpty();
		for (Iterator<String> iterator = l.iterator(); iterator.hasNext();) {
			String string = iterator.next(); 
			System.out.println(string);
		}
		for (int i = 0; i < l.size(); i++) {
			String string = l.get(i);
			System.out.println(string);
		}

		for (String string : l) {
			System.out.println(string);
		}
		
		//l.stream().forEach(System.out::println);

	}
}
