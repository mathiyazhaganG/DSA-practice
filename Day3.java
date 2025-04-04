
import java.util.Scanner;

interface ABB {
	void compile();
}

interface portable {
	void move();
}

class DESKTOP implements ABB, portable {
	@Override
	public void compile() {
		System.out.println("compiling...");
	}

	@Override
	public void move() {
		System.out.println("im-portable");
	}

}

class LAPTOP implements ABB, portable {
	@Override
	public void compile() {
		System.out.println("compiling faster...");
	}

	@Override
	public void move() {
		System.out.println("portable");
	}

}

public class Day3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("do you want desktop or laptop?");
		String system = sc.next();
		sc.close();
		ABB obj;
		try {
			if (system.equalsIgnoreCase("desktop")) {
				obj = new DESKTOP();
				System.out.println("computing....");
				obj.compile();

			}
			if (system.equalsIgnoreCase("laptop")) {
				obj = new LAPTOP();
				System.out.println("computing....");
				obj.compile();
			} else {
				System.out.println("enter something valid");
			}

		} catch (Exception e) {
			System.out.println("somthing went wrong");
		}

	}
}
