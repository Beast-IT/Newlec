package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		/*
		 * 문제: 사용자의 값을 입력받고 출력하는 오목판을 만드시오. 추가문제 : 중복제거
		 * 
		 * 
		 * 
		 * 
		 * 문제푼날: 230619 
		 * 풀이: 나 
		 * 핵심: 조건을 잘 생각한다 !
		 */

		String arr[][] = new String[12][12];// 12*12 바둑판 배열
		boolean chk[][] = new boolean[12][12];//중복값 제거용 배열

		int ox = 0; // 검은돌
		int oy = 0; // 검은돌

		int wx = 0;// 흰돌
		int wy = 0;// 흰돌

		Scanner scan = new Scanner(System.in);

		// ----------------------------------------------------초기 바둑판 양식 배열에 저장
		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 12; y++) {
				if (x == 0 && y == 0)// 왼쪽 위 모서리막기
					arr[x][y] = "┌";
				else if (x == 11 && y == 11)// 오른쪽 아래 모서리막기
					arr[x][y] = "┘";
				else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
					arr[x][y] = "└";
				else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
					arr[x][y] = "┐";
				else if (x == 0)// 위에 막기
					arr[x][y] = "┬";
				else if (x == 11)// 아래 막기
					arr[x][y] = "┴";
				else if (y == 0)// 왼쪽 막기
					arr[x][y] = "├";
				else if (y == 11)// 오른쪽 막기
					arr[x][y] = "┤";
				else
					arr[x][y] = "┼";
			
				chk[x][y] = false;
			}
		}
		// ----------------------------------------------------

		//바둑판 출력
		while (true) {
			
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("그만두기 : -1");
			
			System.out.print("검은돌 [X sp Y] : ");
			ox = scan.nextInt();// x값 좌표 받아오기.
			if (ox == -1)// -1을 받으면 종료한다.
				break;
			oy = scan.nextInt();// y값 좌표 받아오기.
			if(chk[ox][oy]) {
				System.out.println("중복값 입니다. ");
				continue;
				}
			
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) { 
					if (i == ox && j == oy) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
						arr[i][j] = "○";
					else if (i == wx && j == wy)  // 입력받은 값을 바둑판에 ● 출력(제일 우선순위를 가진다.)
						arr[i][j] = "●";
				
				chk[i][j]=true;
				}
			}
			
			System.out.println("그만두기 : -1");
			
			System.out.print("흰돌 [X sp Y] : ");
			wx = scan.nextInt();// x값 좌표 받아오기.
			if (wx == -1)// -1을 받으면 종료한다.
				break;
			wy = scan.nextInt();// y값 좌표 받아오기.
			if(chk[wx][wy]) {
				System.out.println("중복값 입니다. ");
				continue;
			}
			
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) { 
					if (i == ox && j == oy) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
						arr[i][j] = "○";
					else if (i == wx && j == wy)  // 입력받은 값을 바둑판에 ● 출력(제일 우선순위를 가진다.)
						arr[i][j] = "●";
				
				chk[i][j]=true;
				}
			}
			
			while (true) {
				
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 12; j++) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
			/*
			System.out.println("그만두기 : -1");

			System.out.print("검은돌 [X sp Y] : ");
			ox = scan.nextInt();// x값 좌표 받아오기.
			if (ox == -1)// -1을 받으면 종료한다.
				break;
			oy = scan.nextInt();// y값 좌표 받아오기.
			if(chk[ox][oy]) {
				System.out.println("중복값 입니다. ");
				continue;
				}
				
			

			System.out.print("흰돌 [X sp Y] : ");
			wx = scan.nextInt();// x값 좌표 받아오기.
			if (wx == -1)// -1을 받으면 종료한다.
				break;
			wy = scan.nextInt();// y값 좌표 받아오기.
			if(chk[wx][wy]) {
				System.out.println("중복값 입니다. ");
				continue;
			}

			
			
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) { 
					if (i == ox && j == oy) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
						arr[i][j] = "○";
					else if (i == wx && j == wy)  // 입력받은 값을 바둑판에 ● 출력(제일 우선순위를 가진다.)
						arr[i][j] = "●";
				
				chk[i][j]=true;
				}
			}

			// 배열 바둑판 출력 양식.
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

*/
		}

	}// 지역화
}// end main
}

//●○		