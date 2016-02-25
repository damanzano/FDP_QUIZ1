
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point2A();
		point2B();
		point3A();
		point3B();
		point4A();
		point4B();
		point5A();
		point5B();
	}

	public static void point2A() {

		int a, b, c;
		a = 4;
		b = 5;
		c = 3;
		System.out.println("2A");
		System.out.println(a * b + c);
	}

	public static void point2B() {

		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		System.out.println("2B");
		System.out.println(++a + (b * c));
	}

	public static void point3A() {

		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		System.out.println("3A");
		System.out.println(a++ + (b * c));
	}

	public static void point3B() {

		int a, b, c;
		a = 4;
		b = 5;
		c = 3;
		System.out.println("3B");
		System.out.println((a * b) / c);
	}

	public static void point4A() {

		int a, b, c;
		a = 4;
		b = 5;
		c = 3;
		System.out.println("4A");
		if (((a * b) + c) > 23) {
			System.out.println(a);
		}

	}

	public static void point4B() {

		int a, b, c;
		a = 4;
		b = 5;
		c = 2;
		System.out.println("4B");
		if((a*b)%c==3){
			System.out.println(c);
		}else{
			System.out.println(a);
		}
	}
	
	public static void point5A() {

		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		System.out.println("5A");
		switch (++a) {
		case 1:
			System.out.println(a);
		case 2:
			System.out.println(a++);
		case 3:
			System.out.println(++a);
		
		}
		

	}

	public static void point5B() {

		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		System.out.println("5B");
		switch (a++) {
		case 1:
			System.out.println(a);
		case 2:
			System.out.println(a++);
		case 3:
			System.out.println(++a);
		
		}
	}

}
