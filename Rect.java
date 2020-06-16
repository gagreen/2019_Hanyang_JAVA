import java.util.*;

public class Rect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w, h;
		System.out.print("가로 입력:");
		w = s.nextInt();
		System.out.print("세로 입력:");
		h = s.nextInt();
		System.out.println("사각형의 둘레는: "+(2*(w+h)));
		
		System.out.println("사각형의 면적는: "+(w*h));
		s.close();
	}

}
