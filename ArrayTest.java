
public class ArrayTest {

	public static void main(String[] args) {
		double [] a = {1.2, 2.3, 3.4, 4.5};
		double max=0, sum=0;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			sum += a[i];
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println();
		System.out.println("ÇÕ: "+sum);
		System.out.println("ÃÖ´ñ°ª: "+max);
	}

}
