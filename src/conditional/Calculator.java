package conditional;

public class Calculator {
	public String opration;
	public int numberOne;
	public int numberTwo;

	public void calculate() {
		int result = 0;
		switch (opration) {
		case "+":
			result = numberOne + numberTwo;
			break;
		case "-":
			result = numberOne - numberTwo;
			break;
		case "*":
			result = numberOne * numberTwo;
			break;
		case "/":
			if (numberTwo == 0) {
				System.out.println("numberTwo can't be zero");
				break;
			}
			result = numberOne / numberTwo;
			break;

		default:
			System.out.print("Not a valid opration: ");
			System.out.println(opration);
		}
		System.out.println(result);
	}
}
