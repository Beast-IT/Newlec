package 방과후연습용.Jin;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex_0629_02 {
    public static void main(String[] args) throws IOException {
        //문제 7 : 다음 각 절차를 따라 작성하시오.
        //// 1. res/map.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
        //
        //00010
        //01010
        //00000
        //// 2. map이라는 이름으로 5x3 크기의 정수를 담을 수 있는 이차원 배열과 board라는 이름의 10X6크기의 문자를 담을 수 있는 이차원 배열을 생성하시오.
        //
        //[           ]  map = [                                      ];
        //[           ]  board = [                                      ];

        int[][] map = new int[3][5];
        char[][] board = new char[6][10];

        {
            FileInputStream fis = new FileInputStream("afterschool/res/map.txt");
            Scanner fscan = new Scanner(fis);

            for (int i = 0; i < map.length; i++) {
                String str = fscan.nextLine();
                for (int j = 0; j < map[i].length; j++) {
                    String[] tokens = str.split("");
                    map[i][j] = Integer.parseInt(tokens[j]);
                }
            }
        }
        System.out.println("map 데이터 로드 완료");
        //// 3. res/map.txt에서 읽은 데이터로 map 배열을 채우시오.
        //
        //{
        //    // 코드를 작성하는 공간
        //
        //    System.out.println(“map 데이터 로드 완료”);
        //}
        //map 확인용
        {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }



        //// 4. map 데이터 하나는 board 배열의 4칸과 대응되며 다음과 같은 모양으로 대응된다.
        //// map에서 0은 다음 모양과 같다.
        //// ┌ ┐
        //// └ ┘
        //// map에서 1은 다음 모양과 같다.
        //// ▩▩
        //// ▩▩
        //// map에서 읽은 데이터를 이용해서 board 배열을 채우시오.  다음은 board 배열에 채워진
        //// 모습니다.
        //// ┌ ┐┌ ┐┌ ┐▩▩┌ ┐
        //// └ ┘└ ┘└ ┘▩▩└ ┘
        //// ┌ ┐▩▩┌ ┐▩▩┌ ┐
        //// └ ┘▩▩└ ┘▩▩└ ┘
        //// ┌ ┐┌ ┐┌ ┐┌ ┐┌ ┐
        //// └ ┘└ ┘└ ┘└ ┘└ ┘
        //
        //{
        //     // 코드를 작성하는 공간
        //
        //
        //
        //    System.out.println(“board 그리기 완료”);
        //}
        {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++){
                    System.out.printf("%d%d ",i,j);
                }
                System.out.println();
            }
        }
        {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++){
                    if((i%2==0) && (j%2==0)) {
                        board[i][j] = '┌';
                        System.out.printf("%c",board[i][j]);
                    }
                }
                System.out.println();
            }
        }




        //// 5. board 배열을 화면에 출력하는 코드를 작성하시오.
        //
        //{
        //     // 코드를 작성하는 공간
        //
        //
        //
        //    System.out.println(“board 출력 완료”);
        //}
    }
}

