import java.util.*;

public class Larger {

	public static void main(String[] args) {
		int n, m;
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����: ");
		n = s.nextInt();
		System.out.print("�� ��° ����: ");
		m = s.nextInt();
		
		System.out.print("ū ���� ");
		if(n>m) {
			System.out.println(n);
		}
		else {
			System.out.println(m);
		}
		
		s.close();
	}

}
