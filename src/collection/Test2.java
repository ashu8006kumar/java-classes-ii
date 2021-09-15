package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ashish");
		names.add("Dipesh");
		names.add("Ishwor");
		names.add("Sameep");
		names.add("Tenzing");
		names.add("Ashish");
		names.add("Ishwor");
		names.add("Sameep");
		names.add("Ashish");
		names.add("Dipesh");
		names.add("Ishwor");
		names.add("Ashish");
		names.add("Dipesh");
		names.add("Ishwor");
		names.add("Sameep");

		Map<String, Integer> nameMap = new HashMap<>();
		for (String name : names) {
			boolean result = nameMap.containsKey(name);
			if (result) {
				int count = nameMap.get(name);
				count++;
				nameMap.put(name, count);
			} else {// this is first occurrence of this name
				nameMap.put(name, 1);
			}
		}

		for (Entry<String, Integer> entry : nameMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("----------Stream API----------");
		Map<String, Long> nameMap2 = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Entry<String, Long> entry : nameMap2.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
