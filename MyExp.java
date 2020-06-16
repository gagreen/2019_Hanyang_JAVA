
public class MyExp {
	int base;
	int exp;
	
	public int getValue() {
		int result = base;
		for (int i=1; i<exp; i++) {
			result *= base;
		}
		return result;
		
		// return (int)Math.pow(base, exp);
	}
	
	public static void main(String[] args) {
		MyExp e = new MyExp();
		e.base = 2;
		e.exp = 3;
		System.out.println("2ÀÇ 3½Â = " +e.getValue());
		e.base = 3;
		e.exp = 4;
		System.out.println("2ÀÇ 3½Â = " +e.getValue());
	}

}
