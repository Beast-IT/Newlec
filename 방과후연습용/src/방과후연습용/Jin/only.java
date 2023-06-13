package 방과후연습용.Jin;

import java.util.Scanner;

public class only {

	public static void main(String[] args) {

		int total;

		System.out.println("< 뉴렉 카페 신메뉴 개발 >");
		System.out.println("어떤 원두를 사용할까?");
		System.out.println("1. 가성비 원두 2.제주도 원두 3. 프리미엄 뉴렉원두");

		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int coffee = sc.nextInt();

		System.out.println("그 원두의 각겨은 얼마야? 숫자만 입력");
		System.out.print("> ");
		int price = sc.nextInt();

		total = coffee * price;

		System.out.printf("대략\n%d\n원 이군!", total);
		
		sc.close();

	}

}
