import java.util.*;

public class Larger {

	public static void main(String[] args) {
		int n, m;
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 정수: ");
		n = s.nextInt();
		System.out.print("두 번째 정수: ");
		m = s.nextInt();
		
		System.out.print("큰 수는 ");
		if(n>m) {
			System.out.println(n);
		}
		else {
			System.out.println(m);
		}
		
		s.close();
	}

}
