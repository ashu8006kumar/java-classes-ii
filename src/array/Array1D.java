package array;

public class Array1D {

	public static void main(String[] arg) {
		char[] array1 = new char[5];
		array1[0] = 'a';
		array1[1] = 'e';
		array1[2] = 'i';
		array1[3] = 'o';
		array1[4] = 'u';

		char[] array = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (char c : array) {
			System.out.println(c);
		}
		System.out.println("Done");
	}
}
