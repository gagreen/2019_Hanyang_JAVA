import java.util.*;
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		int answer=77;
		
		do {
			System.out.print("���ڸ� ����: ");
			input = s.nextInt();
			if(input > answer) {
				System.out.println("�Է��� ���ڰ� ���亸�� Ů�ϴ�");
			}
			else if(input < answer){
				System.out.println("�Է��� ���ڰ� ���亸�� �۽��ϴ�");
			}
		}while(input != answer);
		
		System.out.println("�����Դϴ�!");
		s.close();
	}

}
