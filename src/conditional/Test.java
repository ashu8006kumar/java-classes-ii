package conditional;

public class Test {
	public static void main(String[] agr) {
		Calculator add = new Calculator();
		add.numberOne = 123;
		add.numberTwo = 0;
		add.opration = "+";
		add.calculate();

		Calculator sub = new Calculator();
		sub.numberOne = 123;
		sub.numberTwo = 0;
		sub.opration = "-";
	}
}
