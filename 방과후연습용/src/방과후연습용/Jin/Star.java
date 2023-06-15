package 방과후연습용.Jin;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();

		int a = 0;
		int b = 0;

		a = (int) (input / 2) + 1;
		b = (int) (input / 2);

		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < (a - 1) - i; j++) {
				System.out.printf(" ");

			}

			for (int k = 0; k < 1 + (i * 2); k++)
				System.out.printf("*");

			System.out.println();
//			----------------------------------------

			// i 0 1 2 3
			// k 1 3 5 7
		}

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf(" ");

			}

			for (int k = 0; k < b * 2 - (i * 2) - 1; k++)
				System.out.printf("*");

			System.out.println();
		}
	}
}
