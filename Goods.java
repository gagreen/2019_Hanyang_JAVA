
public class Goods {
	String name;
	int price;
	int numverOfStock;
	int sold;
	
	public static void main(String[] args) {
		Goods good = new Goods();
		
		good.name = "Canon";
		good.price = 400000;
		good.numverOfStock = 30;
		good.sold = 70;
		System.out.println("��ǰ �̸�: " + good.name);
		System.out.println("��ǰ ����: " + good.price);
		System.out.println("��� ����: " + good.numverOfStock);
		System.out.println("�ȸ� ����: " + good.sold);
	}

}
