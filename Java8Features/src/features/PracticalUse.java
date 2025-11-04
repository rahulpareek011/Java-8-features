package features;

@FunctionalInterface
interface A{
	void display();
}

@FunctionalInterface
interface B{
	int add(int a, int b);
}

@FunctionalInterface
interface C{
	int getTheLength(String s);
}

public class PracticalUse {

	public static void main(String[] args) {
		A aa = () -> System.out.println("Hello from display method");
		aa.display();
		
		//B bb = (a,b) -> {return a+b;}; or
		B bb = (a,b) -> a+b;
		System.out.println(bb.add(100, 50));//150
		
		C cc = s -> s.length();
		int len = cc.getTheLength("hello");
		System.out.println(len);//5
	}

}
