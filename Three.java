import java.util.*;

public class Three {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է��ϼ���: ");
		num = s.nextInt();
		if(num % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		s.close();
	}

}
