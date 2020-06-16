import java.util.*;
public class RectClass {
	public int width, height;
	public RectClass(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int width, height, sum=0;	
		RectClass [] rect = new RectClass[4];
		
		for (int i=0; i<rect.length; i++) {
			System.out.print("사각형"+(i+1)+" 너비와 높이>>");
			width = s.nextInt();
			height = s.nextInt();
			rect[i] = new RectClass(width, height);
			sum += rect[i].getArea();
		}
		
		System.out.print("사각형 전체 합: " + sum);
		s.close();
	}

 
}