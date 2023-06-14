package com.newlecture.app.ex6.control.loop;

public class ForTestProgram {

	public static void main(String[] args) {

		// 문제 1) for문을 이용해서 다음처럼 1을 10번 출력하는 코드를 작성하시요. "i" Index의 약자이다.
		for (int i = 0; i < 10; i++)// index란? 0에서 시작하는 일련번호
			System.out.printf("%d ", 1);

		System.out.println();

		// 문제 2) for문을 이용해서 다음처럼 1부터 10까지 출력하는 코드를 작성하시요. Index는 건들지마!
		for (int i = 0; i < 10; i++)// index란? 0에서 시작하는 일련번호
			System.out.printf("%d ", i + 1);

		System.out.println();

		// 문제 3) for문을 이용해서 다음처럼 10부터 1까지 출력하는 코드를 작성하시요. Index는 건들지마!
		for (int i = 0; i < 10; i++)// index란? 0에서 시작하는 일련번호
			System.out.printf("%d ", 10 - i);

		System.out.println();

		// 문제 4) for문을 이용해서 다음처럼 3부터 7까지 5개의 숫자를 출력하는 코드를 작성하시요. Index는 건들지마!
		for (int i = 0; i < 5; i++)// index란? 0에서 시작하는 일련번호
			System.out.printf("%d ", i + 3);

		System.out.println();

		// 문제 4) for문을 이용해서 다음처럼 1부터 9까지 5개의 숫자(1 3 5 7 9)를 출력하는 코드를 작성하시요. Index는 건들지마!

		// 내 코드
		int j = 1;
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ", i + j);
			j = j + 1;
		}
		System.out.println();

		// 선생님 코드
		// 변수하나를 더 추가해서 계산할 수 있으면 추가해서 하면 됌. 인덱스로만 너무 하려고 Fixation하지 말자.
		for (int i = 0, n = 1; i < 5; i++, n += 2)// 변수n을 for내부에서 하나 더 선언 & n에대한 연산식 추가.
			System.out.printf("%d ", n);

		System.out.println();

		// 문제 5) for문을 이용해서 다음처럼 10개의 숫자(6 10 14 18 22 26 30 34 38 42)를 출력하는 코드를 작성하시요. Index는 건들지마!
		// 방법 1
		for (int i =0,n=6; i < 10; i++,n+=4) 
			System.out.printf("%d ", n);
		
		System.out.println();

		// 방법 2
		for (int i =0; i < 10; i++) 
			System.out.printf("%d ",(i*4)+6);
		
		System.out.println();
		
		// 방법 3 (나만 아는 코드) 
		for (int i =0,n=3; i < 10; i++,n+=2) 
			System.out.printf("%d ", n*2);
		
		System.out.println();
		
		//방법 4 (등차수열 공식)
		// an=a1+(n-1)d
		for (int i =0,n=1,an=6; i < 10; i++,n++,an = 6+(n-1)*4) {
			System.out.printf("%d ", an);
			
		}
		System.out.println();
		

		
		}
	}


