import java.util.*;
public class ArrayAccess {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int max=0;
		
		System.out.println("��� 5�� �Է�:");
		for(int i=0; i<5; i++) {
			a[i] = s.nextInt();
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("���� ū ����"+max+"�Դϴ�.");
		s.close();
	}

}
