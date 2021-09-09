package abstraction;

public class MyBoard implements CustomBoard {

	@Override
	public void size() {
		System.out.println("my board size");

	}

	@Override
	public void color() {
		System.out.println("my board color");

	}

}
