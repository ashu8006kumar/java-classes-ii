
public class BasicException {

	public static void main(String[] agr) {
		int numberOne = 20;
		int numberTwo = 0;
		try {
			System.out.println("start");
			System.out.println(numberOne / numberTwo);
			System.out.println("done");
		} catch (ArithmeticException e) {
			System.out.println("numberTwo can't be zero");
		} finally {
			System.out.println("every time ");
		}
	}
}
