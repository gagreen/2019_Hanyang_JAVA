import java.util.*;
public class ArrayAccess {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int max=0;
		
		System.out.println("양수 5개 입력:");
		for(int i=0; i<5; i++) {
			a[i] = s.nextInt();
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("가장 큰 수는"+max+"입니다.");
		s.close();
	}

}
