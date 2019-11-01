
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5a
		int x = 0;
		while (x < 101) {
			System.out.println(x);
			x = x + 2;
		}
		
		System.out.println();
		
		//5b
		int y = 100;
		while (y > 0 && y <= 100) {
			System.out.println(y);
			y = y - 3;
		}
		
		System.out.println();
		
		//5c
		for (int i = 1; i < 100; i = i+2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//5d
		
		for (int j = 0; j <= 100; j++) {
			if (j % 3 == 0 && j % 5 == 0) {
				System.out.println("HelloWorld");
			} else if (j % 5 == 0 ) {
					System.out.println("World");
				 } else if (j % 3 == 0) {
						System.out.println("Hello");
					} else {
						System.out.println(j);
					}
		}
	}

}
