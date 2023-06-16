package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {

		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 10; y++)
				 if (x == 0 && y == 9)// 오른쪽 위 모서리막기
					System.out.print("┐");
				else if (x == 11 && y == 9)// 오른쪽 아래 모서리막기
					System.out.print("┘");
				else if (x == 0 && y == 0)// 왼쪽 위 모서리막기
					System.out.print("┌");
				else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
					System.out.print("└");
				else	if (x == 0)// 위에 막기
					System.out.print("┬");
				else if (x == 11)// 아래 막기
					System.out.print("┴");
				else if (y == 0)// 왼쪽 막기
					System.out.print("├");
				else if (y == 9)// 오른쪽 막기
					System.out.print("┤");
				else
					System.out.print("┼");

//●○┼ ┴ ┬ 			
			System.out.println();
		}

	}

}
