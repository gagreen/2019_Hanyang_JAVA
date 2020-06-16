
public class While_Loop_Ex {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지 정수의 합은 : " + sum);
	}

}
