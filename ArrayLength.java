import java.util.*;
public class ArrayLength {

	public static void main(String[] args) {
		int a[] = new int[5];
		double sum = 0;
		double average;
		Scanner s = new Scanner(System.in);
		System.out.println(a.length+"���� ���� �Է�");
		for(int i=0; i<a.length; i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		average = sum/a.length;
		System.out.println("���: "+average);
		s.close();
	}

}
