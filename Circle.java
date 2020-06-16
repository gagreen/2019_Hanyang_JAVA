
public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "게살피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+ area);
		
		Circle dount;
		dount = new Circle();
		dount.radius = 2;
		dount.name = "게살피자";
		double area1 = dount.getArea();
		System.out.println(dount.name+"의 면적은 "+ area1);
	}

}
