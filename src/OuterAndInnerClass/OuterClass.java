package OuterAndInnerClass;

public class OuterClass {

	public void doSomething() {
		final int a = 10;
		int b = 0;
		class Inner extends BaseClass {
			public void seeOuter() {
				System.out.println(a);
			}
		}
		Inner in = new Inner();
		in.seeOuter();
		b = in.getA();
		System.out.println("b:" + b);
	}

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.doSomething();
	}
}
