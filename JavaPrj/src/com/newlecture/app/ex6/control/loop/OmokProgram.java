package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {
		/*
		 * 문제: 오목판에 오른쪽 X모으로 흰색 바둑돌을 넣어라.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 문제푼날: 230619 
		 * 풀이: 나 
		 * 핵심: (1,7) (2,6) (3,5)...(7,1) 좌표의 합이 8로 같다! 
		 */
		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 12; y++)
				if (x == 0 && y == 0)// 왼쪽 위 모서리막기
					System.out.print("┌");
				else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
					System.out.print("┐");
				else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
					System.out.print("└");
				else if (x == 11 && y == 11)// 오른쪽 아래 모서리막기
					System.out.print("┘");
				else if (x == 0)// 위에 막기
					System.out.print("┬");
				else if (x == 11)// 아래 막기
					System.out.print("┴");
				else if (y == 0)// 왼쪽 막기
					System.out.print("├");
				else if (y == 11)// 오른쪽 막기
					System.out.print("┤");
				else if (x+y==8)
					System.out.print("●");
				else
					System.out.print("┼");

			System.out.println();
		}
	}
}// end main

//●○		