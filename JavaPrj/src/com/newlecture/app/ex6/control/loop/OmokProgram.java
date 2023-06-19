package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		/*
		 * 문제: 사용자의 값을 입력받고 출력하는 오목판을 만드시오. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 문제푼날: 230619 
		 * 풀이: 나
		 * 핵심: 조건을 잘 생각한다 ! 
		 */
{
	
//----------------------------------------------------초기 바둑판 양식 출력 
	for (int x = 0; x < 12; x++) {
		for (int y = 0; y < 12; y++)
			
			 if (x == 0 && y == 0)// 왼쪽 위 모서리막기
				System.out.print("┌");
			else if (x == 11 && y == 11)// 오른쪽 아래 모서리막기
				System.out.print("┘");
			else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
				System.out.print("└");
			else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
				System.out.print("┐");

			else if (x == 0)// 위에 막기
				System.out.print("┬");
			else if (x == 11)// 아래 막기
				System.out.print("┴");
			else if (y == 0)// 왼쪽 막기
				System.out.print("├");
			else if (y == 11)// 오른쪽 막기
				System.out.print("┤");
			else
				System.out.print("┼");

		System.out.println();
	}
	//----------------------------------------------------초기 바둑판 숫자 입력 후 출력 
	
	int ox = 0;
	int oy = 0;
	
	while(true) {
	
	System.out.println("그만두기 : -1");
	System.out.print("(X sp Y) : ");

	Scanner scan = new Scanner(System.in);
	ox = scan.nextInt();
	if(ox==-1)
		break;
	oy = scan.nextInt();

		
	for (int x = 0; x < 12; x++) {
		for (int y = 0; y < 12; y++)

			 if (x == ox && y == oy) //입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
				System.out.print("○");
			else if (x == 0 && y == 0)// 왼쪽 위 모서리막기
				System.out.print("┌");
			else if (x == 11 && y == 11)// 오른쪽 아래 모서리막기
				System.out.print("┘");
			else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
				System.out.print("└");
			else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
				System.out.print("┐");

			else if (x == 0)// 위에 막기
				System.out.print("┬");
			else if (x == 11)// 아래 막기
				System.out.print("┴");
			else if (y == 0)// 왼쪽 막기
				System.out.print("├");
			else if (y == 11)// 오른쪽 막기
				System.out.print("┤");
			else
				System.out.print("┼");

		System.out.println();
	}
	}
}//지역화 
}// end main
}
//●○		