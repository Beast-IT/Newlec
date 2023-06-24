package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        OUT:
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
                case 1:
                {
                    int ox = -1;
                    int oy = -1;
                    GAMEOVER:
                    while (true) {

                        for (int j = 0; j < 12; j++) {
                            for (int i = 0; i < 12; i++)

                                if (i == ox && j == oy)
                                    System.out.print("●");

                                else if (j == 0 && i == 0)
                                    System.out.print("┌");

                                else if (j == 0 && i == 11)
                                    System.out.print("┐");

                                else if (j == 11 && i == 0)
                                    System.out.print("└");

                                else if (j == 11 && i == 11)
                                    System.out.print("┘");

                                else if (i == 0)
                                    System.out.print("├");

                                else if (i == 11)
                                    System.out.print("┤");

                                else if (j == 0)
                                    System.out.print("┬");

                                else if (j == 11)
                                    System.out.print("┴");

                                else
                                    System.out.print("┼");

                            System.out.println();
                        }

                        do {
                            System.out.println("그만두기:-1");
                            System.out.println("x sp y>");

                            ox = scan.nextInt();
                            if (ox == -1) {
                                System.out.println("GAMEOVER~~");
                                break GAMEOVER;

                            }
                            oy = scan.nextInt();
                            if (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)))
                                System.out.println("오목 좌표 범위를(-1 or 1~10)를 벗어났습니다.");

                        } while (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)));

                    }

                }
                break;

                case 2: {
                    System.out.println("x좌표 y좌표를 스페이스로 구분해 입력해주세요. ex) 2 3");
                    System.out.println("입력하신 후 Enter를 눌러주세요");
                    break;
                }

                case 3: {
                    System.out.println("프로그램을 종료합니다.");
                    break OUT;
                }
                default: {
                    System.out.println("메뉴는 1부터 3까지 밖에 없습니다.");
                }
            }//switch 괄호
        }
    }
}