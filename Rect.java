import java.util.*;

public class Rect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w, h;
		System.out.print("���� �Է�:");
		w = s.nextInt();
		System.out.print("���� �Է�:");
		h = s.nextInt();
		System.out.println("�簢���� �ѷ���: "+(2*(w+h)));
		
		System.out.println("�簢���� ������: "+(w*h));
		s.close();
	}

}
