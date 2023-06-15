package 방과후연습용.Jin;

public class Star {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3 - i; j++) {
				System.out.printf(" ");

			}

			for (int k = 0; k < 1 + (i * 2); k++)
				System.out.printf("*");

			System.out.println();

			// i 0 1 2 3
			// k 1 3 5 7
		}
	}
}
