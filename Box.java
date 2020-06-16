
public class Box {
	int width, length, height;
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public int getVolume() {
		return width*length*height;
	}
	
	public static void main(String[] args) {
		Box b =new Box(20, 20, 30);
		System.out.println("상자의 부피는 "+b.getVolume());

	}

}
