
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
		System.out.println("�ʺ�: " + nemo.width);
		System.out.println("����: " + nemo.height);
		System.out.println("�� ����: " + nemo.getArea());
	}

}
