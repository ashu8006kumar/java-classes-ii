package array;

public class Array2D {

	public static void main(String[] arg) {
		int[][] array = { { 1, 2, 3, 4, 5 }, { 11, 12, 13, 14, 15 } };

		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			int[] subArray = array[i];
			for (int j = 0; j < subArray.length; j++) {
				System.out.print(" ");
				System.out.print(subArray[j]);
			}
			System.out.println("");
		}

		for (int[] subArray : array) {

			for (int value : subArray) {
				System.out.print(" ");
				System.out.print(value);
			}
			System.out.println("");
		}
		System.out.println("Done");
	}
}
