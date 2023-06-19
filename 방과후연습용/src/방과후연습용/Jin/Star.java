package 방과후연습용.Jin;

public class Star {

	public static void main(String[] args) {
		System.out.println("1번 ------------------------------------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2번 ------------------------------------------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("3번 ------------------------------------------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - (i + 1); j++)
				System.out.printf(" ");
			for (int k = 0; k < (i + 1); k++)
				System.out.printf("*");

			System.out.println();
		}
		System.out.println("4번 ------------------------------------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++)
				System.out.printf(" ");
			for (int j = 0; j < 5 - i; j++)
				System.out.printf("*");

			System.out.println();
		}
		System.out.println("5번 ------------------------------------------------------------------------------------");
		for (int i = 0; i < 5; i++) {

			// i=0일때 "j < (3 - i)" -> 공백 " "3개 출력
			for (int j = 0; j < (4 - i); j++) {
				System.out.printf(" ");
			}

			// i=0일때 "k < 1 + (i * 2)" -> 별 "*"개 출력
			for (int k = 0; k < 1 + (i * 2); k++)
				System.out.printf("*");

			System.out.println();
		}
		System.out.println("6번 ------------------------------------------------------------------------------------");
		for (int i = 0; i < 9; i++) {
			// i=0일때 "j < (i + 1)" -> 공백 " " 1개 출력
			for (int j = 0; j < (i + 1); j++) {
				System.out.printf(" ");
			}
			// i=0일때 "k < 5 - (i * 2)" -> 별 "*****" 출력
			for (int k = 0; k < 9 - (i * 2); k++)
				System.out.printf("*");

			System.out.println();
		}
	}// end main
}
