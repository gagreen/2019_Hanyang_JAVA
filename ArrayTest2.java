import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = {0, 20, 10, 30, 40, 50, 60, 70, 80, 90, 100};
		int input, index=-1;
		
		System.out.print("Ž���� �� �Է�: ");
		input = s.nextInt();
		for(int i=0; i<a.length; i++) {
			if(input == a[i]) {
				index = i;
				break;
			}
		}
		System.out.println(input+"���� "+index+"��ġ�� �ֽ��ϴ�.");
		
		s.close();
	}

}
