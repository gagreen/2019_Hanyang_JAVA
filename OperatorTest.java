
public class OperatorTest {
	public static void main(String[] args) {
		int a = 1, b = 1;
		a += 5;
		a *= 2;
		b *= 5;
		
		System.out.println("c=" +(a+b));
		System.out.println("d=" +(a++));
		System.out.println("e=" +(++a));
		System.out.println("f=" +(a+b++));
	}
}
