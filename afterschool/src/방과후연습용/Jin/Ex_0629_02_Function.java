package 방과후연습용.Jin;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex_0629_02_Function {
    public static void main(String[] args) throws IOException {

        int[][] map = new int[3][5];
        char[][] board = new char[6][10];

        loadMap(map);

        outlineBoard(board);

        replaceSquare(map,board);

        printBoard(board);
    }

    private static void loadMap(int[][] map) throws IOException {
        //map.txt 파일 받아오기

            FileInputStream fis = new FileInputStream("afterschool/res/map.txt");
            Scanner fscan = new Scanner(fis);

            for (int i = 0; i < map.length; i++) {
                String str = fscan.nextLine();
                for (int j = 0; j < map[i].length; j++) {
                    String[] tokens = str.split("");
                    map[i][j] = Integer.parseInt(tokens[j]);
                }
            }

            fscan.close();
            fis.close();

        System.out.println("map 데이터 로드 완료");
    }

    private static void outlineBoard(char[][] board) {
        //보드 윤곽 넣기

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    if ((i % 2 == 0))
                        if (j % 2 == 0)
                            board[i][j] = '┌';
                        else
                            board[i][j] = '┐';
                    else if (j % 2 == 0)
                        board[i][j] = '└';
                    else
                        board[i][j] = '┘';
                }
            }
        System.out.println("board 출력 완료");
    }

    private static void replaceSquare(int[][] map, char[][] board) {
        //이상한 네모 입력

            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == 1) {
                        int row = i * 2;
                        int col = j * 2;
                        board[row][col] = '▩';
                        board[row][col + 1] = '▩';
                        board[row + 1][col] = '▩';
                        board[row + 1][col + 1] = '▩';
                    }
                }
    }

    private static void printBoard(char[][] board) {

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {

                    System.out.printf("%c", board[i][j]);
                }
                System.out.println();
            }
    }
}

