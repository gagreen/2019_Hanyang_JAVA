import java.util.*;

class Operator {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a+b;
	}

}
class Add extends Operator {
	int calculate() {
		return a+b;
	}
}

class Sub extends Operator {
	int calculate() {
		return a-b;
	}
}

class Mul extends Operator {
	int calculate() {
		return a*b;
	}
}

class Div extends Operator {
	int calculate() {
		return a/b;
	}
}

public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		int a, b;
		String operator;
		a = s.nextInt();
		b = s.nextInt();
		operator = s.next();
		
		switch (operator) {
		case "+":
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		s.close();

	}

}
