package 방과후연습용.Jin;

import java.util.Scanner;

public class loop_0614 {

	public static void main(String[] args) {

		// 시험 점수를 입력받아서 성적을 출력하세요.
		// A : 90~100, B : 80~89, C : 70~79, D : 60~69, F : ~59

		Scanner sc = new Scanner(System.in); //시험 점수 입력받기

		System.out.print("성적 입력 : ");
		int grade = sc.nextInt(); //Grade에 성적 값 저

		// 90이상 100이하이면 "A" 출력
		if (90 <= grade && grade <= 100) {
			System.out.println("당신의 성적은 A");
		}
		// 80이상 90미이면 "B" 출력
		if (80 <= grade && grade < 90) {
			System.out.println("당신의 성적은 B");
		}
		// 70이상 80미만이면 "C" 출력
		if (70 <= grade && grade < 80) {
			System.out.println("당신의 성적은 C");
		}
		// 60이상 70미만이면 "D" 출력
		if (60 <= grade && grade < 70) {
			System.out.println("당신의 성적은 D");
		}
		// 60미만이면 "F" 출력
		if (grade < 60) {
			System.out.println("당신의 성적은 F! 공부하세요");
		}
		System.out.println("----------------------------------------");
		
		
		// 1에서 100사이의 홀수 개수를 출력하세요.

		int oddnum = 0; //홀수 개수 초기화.

		//oddnum을 2로 나눈 나머지가 1이면 oddnum에 +1씩 증가시켜줘서 카운딩한다.
		for (int i = 0; i < 100; i++) {
			if ((i % 2) == 1) {
				oddnum++;
			}
		}
		System.out.printf("홀수는 %d개 입니다.\n", oddnum);

		System.out.println("----------------------------------------");
		// 66 을 소인수분해하시오. 2,3,11

		int primeFactorization = 44; //초기값 66을 저장.

		// 1은 소수가 아니므로 i의 기준을 2로 잡음.
		for (int i = 2; i <= primeFactorization; i++) {
			// 66을 i(2)로 나누면 나머지 0, true값이니 while문 실행
			while ((primeFactorization % i) == 0) {
				// 2는 소수이면서 합성수 66을 구성하는 소수이므로 2출력
				System.out.println(i);
				//66을 2로 나눠준 값 33을 primeFactorization에 저장.
				primeFactorization = primeFactorization / i;
				
				i=2;//i를2로 초기화 완료!
			}

		}

		System.out.println();

		System.out.println("----------------------------------------");
		// ✏️ 1!+2!+3!+4!+5!의 결과를 구하세요. (Factorial) 답 153

		
		
		
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
