import java.util.*;
public class Balance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=1, money=0, inputMoney;
		System.out.println("---------------------");
		while(n != 4) {
			
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("---------------------");
			System.out.print("����>");
			n = s.nextInt();
			switch (n) {
				case 1:
					System.out.print("���ݾ�>");
					inputMoney = s.nextInt();
					money += inputMoney;
					break;
				case 2:
					System.out.print("��۾�>");
					inputMoney = s.nextInt();
					money -= inputMoney;
					break;
				case 3:
					System.out.println("�ܰ�>" + money);
					break;
			}
		}
		System.out.println("���α׷� ����");
		s.close();
	}

}
