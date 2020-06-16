import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String name;
		int num;
		String name2;
		Scanner s = new Scanner(System.in);
		
		System.out.print("내가 좋아하는 그룹명: ");
		name = s.next();
		System.out.print("총 몇명: ");
		num = s.nextInt();
		System.out.print("내가 가장 좋아하는 멤버는?: ");
		name2 = s.next();
		System.out.println(name + " " + num + " " + name2);
		
		s.close();
	}

}
