package poly;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();

		Base base = new Base();
		t.test(base);

		Derived d = new Derived();
		t.test(d);

		Base baseDerived = new Derived();
		t.test(baseDerived);

		Base x = new Base();
		System.out.println(x.age);
		
		Base y = new Base(20);
		System.out.println(y.age);

	}

	void test(Base base) {
		base.area();
	}

}
