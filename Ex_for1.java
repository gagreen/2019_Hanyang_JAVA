import java.util.*;
public class Ex_for1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ют╥б: ");
		int input = s.nextInt();
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}