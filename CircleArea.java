import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		double pi = 3.14;
		int radius;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է� :");
		radius = s.nextInt();
		
		System.out.println(radius*radius*pi);
		
		s.close();
	}

}
