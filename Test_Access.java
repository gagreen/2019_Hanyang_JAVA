class Test{
	//private int a = 1;
	int b;
	public int c;
}

public class Test_Access {

	public static void main(String[] args) {
		Test obj = new Test();
		// obj.a = 10; private ¾ÈµÈ´Ù.
		obj.b = 20;
		obj.c = 30;
	}

}
