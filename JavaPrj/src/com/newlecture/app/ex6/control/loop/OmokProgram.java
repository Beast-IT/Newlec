package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {
		/*
		 * 문제: 오목판에 화살표 모양의 흰색 바둑돌을 넣어라.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 문제푼날: 230619 
		 * 풀이: 선생님  
		 * 핵심: 일차함수 그래프를 생각하자 ! 
		 */
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
				
				
				else if (x == y-2 || y == -x+8) // 그래프 y-x, x-y
					System.out.print("●");
				else if (x >= y-2 && y <= -x+8)// 영역안에 채우기
					System.out.print("●");
			
				else
					System.out.print("┼");

			System.out.println();
		}
	}
}// end main

//●○		