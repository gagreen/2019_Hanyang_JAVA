import java.util.*;
public class ScannerEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age;
		double weight, height;
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 입력하세요");
		age = s.nextInt();
		weight = s.nextDouble();
		height = s.nextDouble();
		
		System.out.println("나이는 "+age+"살, 체중은 "+weight+"kg, 신장은"+height+"cm입니다.");
		s.close();
	}

}
