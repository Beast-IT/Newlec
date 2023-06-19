package 방과후연습용.Jin;

import java.util.Scanner;

public class 반복문연습 {

	public static void main(String[] args) {

		// x와 ++만 사용해서 결과값 도출
		System.out.println("[x와 ++만 사용해서 결과값 도출]");
		int x = 1;
		System.out.printf("int x = %d\n",x);// 1
		System.out.printf("int x = %d\n",++x);// 2
		System.out.printf("int x = %d\n",x++);// 2
		System.out.println(x);// 3
		System.out.println("--------------------------------------------------------------");

		// 오늘 배운 연산자를 자유롭게 모두 사용해보세요.
		System.out.println("[오늘 배운 연산자를 자유롭게 모두 사용해보세요.]");
		boolean isLessThan3 = x < 3; // false
		String y = x < 3 ? "3보다 작습니다." : "3보다 큽니다.";// 삼항 연산자

		System.out.println(isLessThan3);
		System.out.println(y);
		System.out.println("--------------------------------------------------------------");
		// 정수를 받아 입력 값이 5보다 크고 10보다 작을때 출력하는 코드
		System.out.println("[정수를 받아 입력 값이 5보다 크고 10보다 작을때 출력하는 코드]");
		Scanner sc = new Scanner(System.in);// 정수를 받아 입력 값이 5보다 크고 10보다 작을때 출력하는 코드 

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 5보다 크고 10보다 작을 때 출력
		if (5 < input && input < 10)
			System.out.println(input);

		if (5 > input || input > 10)
			System.out.println("5초과 10미만 값일때만 출력합니다.");
		System.out.println("--------------------------------------------------------------");

		// 사용자에게 입력 받은 값이 2또는 3의 배수인 수일 때, 출력하는 코드
		System.out.println("사용자에게 입력 받은 값이 2또는 3의 배수인 수일 때, 출력하는 코드");
		System.out.print("정수 입력 : ");
		int mul = sc.nextInt();

		// 2또는 3의 배수인 수일대 출력하는 조건
		if (mul % 2 == 0)
			System.out.println("2의 배수입니다.");

		if (mul % 3 == 0)
			System.out.println("3의 배수입니다.");

		System.out.println("--------------------------------------------------------------");

		// 삼항 연산자를 이용하여 X + Y가 홀수라면 변수 isOdd에 True를 할당하는 코드를 작성하세요.
		System.out.println("삼항 연산자를 이용하여 X + Y가 홀수라면 변수 isOdd에 True를 할당하는 코드를 작성하세요.");
		int a = 1;
		int b = 4;
		boolean isOdd = ((a + b) % 2) == 1 ? true : false;

		System.out.println(isOdd);
		System.out.println("--------------------------------------------------------------");

		// for문을 이용하여 정수 1부터 10이하의 정수 합을 출력하세요.
		//
		System.out.println("for문을 이용하여 정수 1부터 10이하의 정수 합을 출력하세요.");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}

		System.out.println(sum);

		System.out.println("--------------------------------------------------------------");
		// for문을 이용하여 정수 1부터 10이하의 정수 중, 짝수만 작은 수부터 출력하세요.
		System.out.println("for문을 이용하여 정수 1부터 10이하의 정수 중, 짝수만 작은 수부터 출력하세요.");
		
		int even = 0;
		for (int j = 1; j < 11; j++) {
			even = j;
			if ((even % 2) == 0) {
				System.out.printf("%d ", even);
			}

		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		// for문을 이용하여 정수 1부터 10이하의 정수 중, 홀수만 큰 수부터 출력하세요.
		System.out.println("for문을 이용하여 정수 1부터 10이하의 정수 중, 홀수만 큰 수부터 출력하세요.");
		int odd = 0;
		for (int k = 10; k > 0; k--) {
			odd = k;
			if ((odd % 2) == 1) {
				System.out.printf("%d ", odd);
			}

		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("while문을 이용하여 정수 1부터 10이하의 정수를 출력하세요.");
		// while문을 이용하여 정수 1부터 10이하의 정수를 출력하세요.
		int wh = 1;
		while (wh <= 10) {
			System.out.printf("%d ", wh++);
		}

		System.out.println();
		System.out.println("--------------------------------------------------------------");
		// while문을 이용하여 정수 1부터 100이하의 정수 중 3의 배수만 출력하세요.
		System.out.println("while문을 이용하여 정수 1부터 100이하의 정수 중 3의 배수만 출력하세요.");
		int multhree = 1;
		while (multhree <= 100) 
			if ((multhree % 3) == 0)
				System.out.printf("%d ", multhree);
			multhree++;
		}

	}

