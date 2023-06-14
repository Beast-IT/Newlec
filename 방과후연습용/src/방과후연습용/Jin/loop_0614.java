package 방과후연습용.Jin;

import java.util.Scanner;

public class loop_0614 {

	public static void main(String[] args) {

		// 시험 점수를 입력받아서 성적을 출력하세요.
		// A : 90~100, B : 80~89, C : 70~79, D : 60~69, F : ~59

		Scanner sc = new Scanner(System.in); //시험 점수 입력받기

		System.out.print("성적 입력 : ");
		int grade = sc.nextInt();

		if (90 <= grade && grade <= 100) {
			System.out.println("당신의 성적은 A");
		}
		if (80 <= grade && grade <= 89) {
			System.out.println("당신의 성적은 B");
		}
		if (70 <= grade && grade <= 79) {
			System.out.println("당신의 성적은 C");
		}
		if (60 <= grade && grade <= 69) {
			System.out.println("당신의 성적은 D");
		}
		if (grade < 60) {
			System.out.println("당신의 성적은 F! 공부하세요");
		}
		System.out.println("----------------------------------------");
		// 1에서 100사이의 홀수 개수를 출력하세요.

		int oddnum = 0; //홀수 개수 초기화.

		for (int i = 0; i < 100; i++) {
			if ((i % 2) == 1) {
				oddnum++;
			}
		}
		System.out.printf("홀수는 %d개 입니다.\n", oddnum);

		System.out.println("----------------------------------------");
		// 66 을 소인수분해하시오. 2,3,11

		int primeFactorization = 66;

		for (int i = 2; i <= primeFactorization; i++) {
			while ((primeFactorization % i) == 0) {
				System.out.println(i);
				primeFactorization = primeFactorization / i;
			}

		}

//		while (div <= 66) {
//			if ((primeFactorization % div) == 0) {
//				System.out.printf("%d ", div);
//			}
//			div++;
//		}
		System.out.println();

		System.out.println("----------------------------------------");
		// ✏️ 1!+2!+3!+4!+5!의 결과를 구하세요. (Factorial) 답 153

		int j=0;
		int psum=0;
		for(int i=5;i<0;i--) {
			psum=psum+(i*j);
			
		}
		System.out.println(psum);
		
		System.out.println("----------------------------------------");
		// ✏️사용자로부터 정수를 입력받아 총합이 100이 넘을 때까지 반복하는 코드를 작성하세요. 출력은 다음과 같습니다.
		int sum = 0;
		while (sum < 100) {
			System.out.print("입력 >");
			int input = sc.nextInt();

			sum = sum + input;
			System.out.printf("합 : %d\n", sum);
		}
		System.out.println("종료!");

		System.out.println("----------------------------------------");
		// ✏️위의 문제에서 입력받는 값이 짝수일 때만 합하여 100이 넘을 때 까지 반복하는 코드를 작성하세요.

		int evensum = 0;
		while (evensum < 100) {
			System.out.print("입력 >");
			int eveninput = sc.nextInt();
			while ((eveninput % 2) != 0) {
				System.out.print("짝수 입력 >");
				eveninput = sc.nextInt();
			}
			evensum = evensum + eveninput;
			System.out.printf("합 : %d\n", evensum);
		}
		System.out.println("종료!");

	}

}
