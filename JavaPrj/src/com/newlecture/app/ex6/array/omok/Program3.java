package com.newlecture.app.ex6.array.omok;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        String[][] stack = new String[12][12];
        boolean[][] duplicate = new boolean[12][12];

        int count = 1;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {

                duplicate[i][j] = false;

                if (i == 0 && j == 0)
                    stack[i][j] = "┌";
                else if (i == 0 && j == 11)
                    stack[i][j] = "┐";
                else if (i == 11 && j == 0)
                    stack[i][j] = "└";
                else if (i == 11 && j == 11)
                    stack[i][j] = "┘";
                else if (i == 0)
                    stack[i][j] = "┬";
                else if (i == 11)
                    stack[i][j] = "┴";
                else if (j == 0)
                    stack[i][j] = "├";
                else if (j == 11)
                    stack[i][j] = "┤";
                else
                    stack[i][j] = "┼";

            }
        }

        int ox = -1;
        int oy = -1;
        int beforeX = -1;
        int beforeY = -1;


        Scanner sc = new Scanner(System.in);

        while (true) {

            if (ox != -1 && oy != -1 && !duplicate[ox][oy]) {

                beforeX = ox;
                beforeY = oy;

                if (count % 2 == 1) {
                    stack[ox][oy] = "●";
                    System.out.println("백돌 차례입니다");
                } else {
                    stack[ox][oy] = "○";
                    System.out.println("흑돌 차례입니다");
                }

                duplicate[ox][oy] = true;

                count++;

                System.out.printf("이전에 착수한 곳 : [%d][%d]", beforeX, beforeY);

                System.out.println("\n착수되었습니다.");
            } else if (count > 1)
                System.out.println("\n둘 수 없는 자리입니다.");


            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++)
                    System.out.print(stack[i][j]);
                System.out.println();
            }

            System.out.println("그만두기 : - 1");
            System.out.print("(x sp y) : ");
            ox = sc.nextInt();

            if (ox == -1)
                break;

            oy = sc.nextInt();

            System.out.println("==================================");


        }

        System.out.println("종료되었습니다.");

    }
}