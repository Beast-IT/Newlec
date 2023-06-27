package com.newlecture.app.ex6.array.omok;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program3_SaveLoad {
    public static void main(String[] args) throws IOException {
        final int empty=0;//데이터로 저장하기 위한 값.
        final int blackStone=1;//검돌 저장데이터 값.
        final int whiteStone=2;//흰돌 저장데이터 값.

        int[][] save=new int[12][12];//데이터 저장 변수.
        boolean[][] saveChk=new boolean[12][12];//중복값 저장 변수
        char[][] saveBoard=new char[12][12];//보드값 저장

        boolean loadswitch = false;

        //countBefore
        int countBefore=1;

        QUIT:
        while (true) {

            char board[][] = new char[12][12];// 12*12 바둑판 배열
            boolean chk[][] = new boolean[12][12];//중복값 판별용 배열
            // ----------------------------------------------------
            // ----------------------------------------------------
            int ox = -1; // 돌
            int oy = -1; // 돌

            //이전좌표
            int xBefore = -1;
            int yBefore = -1;

            // ----------------------------------------------------초기 바둑판 양식 배열에 저장
            for (int x = 0; x < 12; x++) {
                for (int y = 0; y < 12; y++) {
                    if (x == 0 && y == 0) {// 왼쪽 위 모서리막기
                        board[x][y] = '┌';
                        saveBoard[x][y]='┌';
                    }
                    else if (x == 11 && y == 11){// 오른쪽 아래 모서리막기
                        board[x][y] = '┘';
                        saveBoard[x][y]='┘';
                    }
                    else if (x == 11 && y == 0) {// 왼쪽 아래 모서리막기
                        board[x][y] = '└';
                        saveBoard[x][y] = '└';
                    }
                    else if (x == 0 && y == 11) {// 오른쪽 위 모서리막기
                        board[x][y] = '┐';
                        saveBoard[x][y] = '┐';
                    }
                    else if (x == 0) {// 위에 막기
                        board[x][y] = '┬';
                        saveBoard[x][y] = '┬';
                    }
                    else if (x == 11) {// 아래 막기
                        board[x][y] = '┴';
                        saveBoard[x][y] = '┴';
                    }
                    else if (y == 0) {// 왼쪽 막기
                        board[x][y] = '├';
                        saveBoard[x][y] = '├';
                    }
                    else if (y == 11) {// 오른쪽 막기
                        board[x][y] = '┤';
                        saveBoard[x][y] = '┤';
                    }
                    else {
                        board[x][y] = '┼';
                        saveBoard[x][y] = '┼';
                    }
                }
            }

            Scanner scan = new Scanner(System.in);

            System.out.println("┌───────────────────────────┐");
            System.out.println("│          Omok Game        │");
            System.out.println("└───────────────────────────┘");
            System.out.println();

            System.out.println("1. 게임시작");
            System.out.println("2. 도움말");
            System.out.println("3. 저장하기");
            System.out.println("4. 불러오기");
            System.out.println("5. 종료");
            System.out.print(">");
            int option = scan.nextInt();


            //저장값 불러오기
            if(loadswitch){
                        for(int i=0;i<12;i++)
                            for(int j=0;j<12;j++) {
                                if(save[i][j]==1) {
                                    chk[i][j] = saveChk[i][j];//중복값 T & F
                                    saveBoard[i][j] = '○';;//바둑판정보
                                    board[i][j]=saveBoard[i][j];
                                }

                                if(save[i][j]==2) {
                                    chk[i][j] = saveChk[i][j];//중복값 T & F
                                    saveBoard[i][j] = '●';;//바둑판정보
                                    board[i][j]=saveBoard[i][j];
                                }
                            }
                    }


            switch (option) {
                //1. 게임시작
                case 1: {
                     int count = 1;// 홀수일때 흰돌, 짝수일때 검돌
                    //이전바둑돌진행상황 가져오기
                    if(loadswitch)
                    count=countBefore;

                    GAMEOVER:
                    while (true) {
                        //중복 제거 & 바둑알 넣기 & 첫 사이클은 그냥 지나침.
                        //첫 사이클부터 통과하면 배열 변수 초기값 -1이여서 오류발생!
                        if (ox != -1 && oy != -1 && !chk[ox][oy]) {
                            xBefore = ox;
                            yBefore = oy;

                            if (count % 2 == 1) {
                                board[ox][oy] = '○';
                                save[ox][oy]=blackStone;
                            }
                            else if (count % 2 == 0) {
                                board[ox][oy] = '●';
                                save[ox][oy]=whiteStone;
                            }

                            chk[ox][oy] = true;
                            saveChk[ox][oy]=true;
                            count++;
                            countBefore=count;
                            loadswitch=false;

                            System.out.printf("☆이전 좌표 : [%2d][%2d]☆\n", xBefore, yBefore);
                        } else if (countBefore>1 && count>1)
                            System.out.println("\n☆★☆★고민해보세요!☆★☆★");

                        // 배열 바둑판 출력 양식.
                        {
                            for (int i = 0; i < 12; i++) {
                                for (int j = 0; j < 12; j++) {
                                    System.out.print(board[i][j]);
                                }
                                System.out.println();
                            }
                        }

                        //좌표 입력
                        do {
                            System.out.println("\n그만두기:-1");
                            if (count % 2 == 1)
                                System.out.println("○ 흑돌 차례입니다");
                            else
                                System.out.println("● 백돌 차례입니다");
                            System.out.print(" x sp y> ");


                            ox = scan.nextInt();
                            if (ox == -1) {
                                System.out.println("GAMEOVER~~");
                                break GAMEOVER;
                            }
                            oy = scan.nextInt();

                            //1~11 범위를 벗어나면 배열 Index오류 발생!! ☆★중요☆★ 예) 15입력시 오류발생해서 멈춤...
                            if (!(1 <= ox && ox <= 11) || !(1 <= oy && oy <= 11)) {
                                System.out.println("\n              ♨경고♨                ");
                                System.out.println("오목 좌표의 범위(-1 or 1~11)를 벗어났습니다.");
                            }

                        } while (!(1 <= ox && ox <= 11) || !(1 <= oy && oy <= 11));
                        System.out.println("==================================");

                    }
                }
                break;

                //2. 도움말
                case 2: {
                    System.out.println("좌표를 입력하면 게임을 할 수 있다");
                    break QUIT;
                }
                //3. 저장하기.
                case 3: {
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("       게임을 저장합니다.      ");
                    System.out.println("└───────────────────────────┘");
                    System.out.println();

                    FileOutputStream fos = new FileOutputStream("JavaPrj/res/Data/Omok_save.txt");
                    PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

                    //save[][]에 데이저 저장
                    {
                        for (int i=0;i<12;i++) {
                            for (int j = 0; j < 12; j++)
                                fout.printf("%d ", save[i][j]);
                            fout.println();
                        }
                        fout.printf("%d ", countBefore);//이전 플레이 기록
                    }
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("      게임을 저장 했습니다.    ");
                    System.out.println("└───────────────────────────┘");
                    System.out.println();

                    fout.close();
                    fos.close();
                    break;
                }
                //4. 불러오기
                case 4: {
                    FileInputStream fis = new FileInputStream("JavaPrj/res/Data/Omok_save.txt");
                    Scanner sc = new Scanner(fis);

                    //파일 읽어와서 save[][]에 저장
                    {
                        for (int i=0;i<12;i++) {
                            for (int j = 0; j < 12; j++)
                                save[i][j]=sc.nextInt();
                            System.out.println();
                        }
                        countBefore=sc.nextInt();
                    }
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("      게임을 불러왔습니다.     ");
                    System.out.println("└───────────────────────────┘");
                    System.out.println();

                    loadswitch=true;
                    sc.close();
                    fis.close();
                    break;
                }
                //5. 종료
                case 5: {
                    System.out.println("종료");
                    break QUIT;
                }
                default:
                {
                    System.out.println("1~5까지 숫자만 입력하세요");
                    break;
                }
            }
        }
    }
}

