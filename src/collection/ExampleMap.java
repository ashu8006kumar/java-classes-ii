package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExampleMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(2, "Ashish");
		map.put(1, "Tom");
		map.keySet();
		map.entrySet();
		map.values();
		map.size();

		for (Integer integer : map.keySet()) {
			System.out.println(integer);
			System.out.println(map.get(integer));
		}

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		} 
	}
}
