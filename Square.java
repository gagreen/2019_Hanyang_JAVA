
public class Square {
	int width, height;
	
	public int getArea() {
		return (width*height);
	}
	public static void main(String[] args) {
		Square nemo;
		nemo = new Square();
		nemo.height = 30;
		nemo.width = 20;
		System.out.println("너비: " + nemo.width);
		System.out.println("높이: " + nemo.height);
		System.out.println("총 면적: " + nemo.getArea());
	}

}
