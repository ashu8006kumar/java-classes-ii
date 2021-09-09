package text;

public class BasicStringOprations {

	public static void main(String[] args) {
		String name1 = "Ashish Kumar";
		String name2 = "Ashish Kumar";
		String name3 = new String("Ashish Kumar");

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name3 == name1);
		System.out.println("******************");
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name3));
		System.out.println(name3.equals(name1));
		System.out.println("******************");

		String[] strArray = name3.split(" ");
		System.out.println(strArray.length);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		String[] strArray2 = "kumar.ashish@xyz.com,ashu8006kumar@gmail.com".split(",");
		for (int i = 0; i < strArray2.length; i++) {
			System.out.println(strArray2[i]);
		}

		for (int i = name1.length() - 1; i >= 0; i--) {
			System.out.print(name1.charAt(i));
		}
		System.out.println("******************");
		String[] nameArray = name1.split(" ");
		for (int i = nameArray.length - 1; i >= 0; i--) {
			System.out.print(nameArray[i] + " ");
		}
		System.out.println("******************");
		System.out.println(name1.toUpperCase());
		System.out.println("******************");
		String name4 = "ASHISH KUMAR";
		System.out.println(name4.equalsIgnoreCase(name1));
		String[] name4Array = name4.split(" ");
		for (int i = 0; i < name4Array.length; i++) {
			String part = name4Array[i];
			for (int j = part.length() - 1; j >= 0; j--) {
				System.out.print(part.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("******************");
	}

}
