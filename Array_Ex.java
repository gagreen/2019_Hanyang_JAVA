import java.util.*;
public class Array_Ex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = new int[5];
		int temp;
		for(int i=0; i<5; i++) {
			a[i] = s.nextInt();
		}
		for (int i=0; i<5-1; i++) {
			for(int j=i+1; j<5; j++) {
				if(a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(a[i] + " ");
		}
		s.close();
	}

}
