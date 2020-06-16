
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
		System.out.println("상품 이름: " + good.name);
		System.out.println("상품 가격: " + good.price);
		System.out.println("재고 수량: " + good.numverOfStock);
		System.out.println("팔리 수량: " + good.sold);
	}

}
