package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		while (true) {

			// 흰돌
			System.out.print("검은돌 x 좌표값 : ");
			int xx = sc.nextInt();
			System.out.print("검은돌 y 좌표값 : ");
			int yy = sc.nextInt();

			// 검은돌
			System.out.print("흰돌 x 좌표값 : ");
			int xxx = sc.nextInt();
			System.out.print("흰돌 y 좌표값 : ");
			int yyy = sc.nextInt();

			for (int x = 0; x < 12; x++) {
				for (int y = 0; y < 10; y++)
					if (x == 0 && y == 0)// 왼쪽 위 모서리막기
						System.out.print("┌");
					else if (x == 0 && y == 9)// 오른쪽 위 모서리막기
						System.out.print("┐");
					else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
						System.out.print("└");
					else if (x == 11 && y == 9)// 오른쪽 아래 모서리막기
						System.out.print("┘");
					else if (x == 0)// 위에 막기
						System.out.print("┬");
					else if (x == 11)// 아래 막기
						System.out.print("┴");
					else if (y == 0)// 왼쪽 막기
						System.out.print("├");
					else if (y == 9)// 오른쪽 막기
						System.out.print("┤");
					else if (x == xx && y == yy)// 검은돌
						System.out.print("●");
					else if (x == xxx && y == yyy)// 흰돌
						System.out.print("○");
					else
						System.out.print("┼");

				System.out.println();
			}
		}

	}// end main

}

//●○┼ ┴ ┬ 			