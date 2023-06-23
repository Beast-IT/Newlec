package com.newlecture.app.ex6.array.omok;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        char board[][] = new char[12][12];// 12*12 바둑판 배열
        boolean chk[][] = new boolean[12][12];//중복값 제거용 배열

        // ----------------------------------------------------초기 바둑판 양식 배열에 저장
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    board[x][y] = '┌';
                else if (x == 11 && y == 11)// 오른쪽 아래 모서리막기
                    board[x][y] = '┘';
                else if (x == 11 && y == 0)// 왼쪽 아래 모서리막기
                    board[x][y] = '└';
                else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
                    board[x][y] = '┐';
                else if (x == 0)// 위에 막기
                    board[x][y] = '┬';
                else if (x == 11)// 아래 막기
                    board[x][y] = '┴';
                else if (y == 0)// 왼쪽 막기
                    board[x][y] = '├';
                else if (y == 11)// 오른쪽 막기
                    board[x][y] = '┤';
                else
                    board[x][y] = '┼';

                chk[x][y] = false;
            }
        }
        // ----------------------------------------------------
        QUIT:
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("┌───────────────────────────┐");
            System.out.println("│          Omok Game        │");
            System.out.println("└───────────────────────────┘");
            System.out.println();

            System.out.println("1. 게임시작");
            System.out.println("2. 도움말");
            System.out.println("3. 종료");
            System.out.print(">");
            int option = scan.nextInt();

            switch (option) {
                //1. 게임시작
                case 1: {
                    int ox = -1; // 돌
                    int oy = -1; // 돌
                    int xBefore = -1;
                    int yBefore = -1;

                    int role = 0;// 홀수일때 흰돌, 짝수일때 검돌

                    GAMEOVER:
                    while (true) {
                        // 배열 바둑판 출력 양식.
                        {
                            for (int i = 0; i < 12; i++) {
                                for (int j = 0; j < 12; j++) {
                                    System.out.print(board[i][j]);
                                }
                                System.out.println();
                            }
                        }

                        xBefore = ox;
                        yBefore = oy;
                        do {
                            System.out.println("그만두기:-1");

                            if (role % 2 == 0) {

                                System.out.println("검은돌 입력 x sp y> ");

                                ox = scan.nextInt();
                                if (ox == -1) {
                                    System.out.println("GAMEOVER~~");
                                    break GAMEOVER;
                                }

                                oy = scan.nextInt();
                                if (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)))
                                    System.out.println("오목 좌표 범위를(-1 or 1~10)를 벗어났습니다.");

                                if (chk[ox][oy])
                                    System.out.println("중복값입니다.");

                                board[ox][oy] = '○';

                                role++;

                            } else if (role % 2 != 0) {
                                System.out.println("흰돌 입력 x sp y> ");

                                ox = scan.nextInt();
                                if (ox == -1) {
                                    System.out.println("GAMEOVER~~");
                                    break GAMEOVER;
                                }

                                oy = scan.nextInt();
                                if (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)))
                                    System.out.println("오목 좌표 범위를(-1 or 1~10)를 벗어났습니다.");

                                if (chk[ox][oy])
                                    System.out.println("중복값입니다.");

                                board[ox][oy] = '●';

                                role++;
                            }

                        } while (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)));
                        chk[ox][oy] = true;

                    }
                }
                break;
                //2. 도움말.
                case 2: {
                    System.out.println("좌표를 입력하면 게임을 할 수 있다");
                    break;
                }
                //3. 종료
                case 3: {
                    System.out.println("종료");
                    break QUIT;
                }
            }
        }
    }
}

