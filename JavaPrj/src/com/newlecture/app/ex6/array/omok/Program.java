package com.newlecture.app.ex6.array.omok;

public class Program {
    public static void main(String[] args) {
        char[][] board = new char[12][12];

        int[] oxes = new int[10];
        int[] oxys = new int[10];

        int width;
        int height;
        int turn=1;

        char BLACK_STONE = '○';
        char WHITE_STONE = '●';


        //'┼' 값 저장
        {
            for (int y = 0; y < 12; y++)
                for (int x = 0; x < 12; x++)
                    board[y][x] = '┼';

            int ox = 3;
            int oy = 5;

            board[oy][ox] = turn==BLACK_STONE? '○':'●';


        }
        //12*12로 출력
        {
            for (int y = 0; y < 12; y++) {
                for (int x = 0; x < 12; x++) {
                    System.out.printf("%c", board[y][x]);
                }
                System.out.println();
            }
        }
    }

    //
}

