import java.util.*;
public class ScannerEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age;
		double weight, height;
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� �Է��ϼ���");
		age = s.nextInt();
		weight = s.nextDouble();
		height = s.nextDouble();
		
		System.out.println("���̴� "+age+"��, ü���� "+weight+"kg, ������"+height+"cm�Դϴ�.");
		s.close();
	}

}
