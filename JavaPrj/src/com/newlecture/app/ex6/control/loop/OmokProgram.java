package com.newlecture.app.ex6.control.loop;

 import java.util.Scanner;

 public class OmokProgram {

 	public static void main(String[] args) {

 		QUIT:
 		while (true) {

 			System.out.println("┌────────────┐ ");
 			System.out.println("│       Omok Game       │ ");
 			System.out.println("└────────────┘");
 			System.out.println();
 			System.out.println("1. 게임시작");
 			System.out.println("2. 도움말");
 			System.out.println("3. 종료");
 			System.out.println(">");

 			Scanner scan = new Scanner(System.in);
 			int menu = scan.nextInt();

 			// 게임시작
 			switch (menu) {
 			case 1:
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
 				// ----------------------------------------------------초기 바둑판 숫자 입력 후 출력
 				GAMEOVER:
 					while (true) {

 					int ox = 0;
 					int oy = 0;

 					// x y 좌표 입력 받음.
 					do {
 						System.out.println("그만두기:-1 0");
 						System.out.print("(X sp Y) : ");
 						ox = scan.nextInt();
 						oy = scan.nextInt();

 						// -1이면 종료
 						if (ox == -1 || oy == -1) {
 							System.out.println("GAMEOVER");
 							break GAMEOVER;
 						}

 						if (!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10))
 							System.out.println("오목 좌표의 범위(-1 or 1~10)를 벗어났습니다.");

 						// 정상 입력범위 찾기.
 					} while (!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10));

 					for (int x = 0; x < 12; x++) {
 						for (int y = 0; y < 12; y++)
 							if (x == ox && y == oy) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
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
 				} // 게임시작 while문
 				break;

 			case 2: {
 				System.out.println("도움말");
 			}
 			case 3: {
 				System.out.println("종료");
 				break QUIT;
 			}
 			default: {
 				System.out.println("메뉴는 1~3까지 밖에 없어");
 			}
 			}
 		}

 	}// end main
 }