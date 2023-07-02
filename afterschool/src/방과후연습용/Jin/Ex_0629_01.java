package 방과후연습용.Jin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

        //문제 6 : 다음 각 절차를 따라 작성하시오.
        //
        //// 1. res/bitmap.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
        //
        //11111111110000000000
        //11111111100000000000
        //11111111000000000000
        //11111110000000000000
        //11111100000000000000
        //11111000000000000000
        //11110000000000000000
        //11100000000000000000
        //11000000000000000000
        //10000000000000000000
public class Ex_0629_01 {
    public static void main(String[] args) throws IOException {

        //2. bitmap이라는 이름으로 20X10크기의 정수를 담을 수 있는 이차원 배열을 생성하시오.
        // [           ]  bitmap = [                                      ];
        int[][] bitmap = new int[10][20];

        //파일 읽어오기 & 읽어온 파일 btimap 배열에 하나씩 담기.
        {
            FileInputStream fis = new FileInputStream("afterschool/res/bitmap.txt");
            Scanner fscan = new Scanner(fis);

            for (int i = 0; i < bitmap.length; i++) {
                String str = fscan.nextLine();
                for (int j = 0; j < bitmap[i].length; j++) {

                    String[] tokens = str.split("");
                    bitmap[i][j] = Integer.parseInt(tokens[j]);

                    System.out.print(bitmap[i][j]);
                }
                System.out.println();
            }

        //3. 다음 그림과 같은 모양이 되도록 값의 위치를 변경하시오
        //00000000001111111111
        //00000000000111111111
        //00000000000011111111
        //00000000000001111111
        //00000000000000111111
        //00000000000000011111
        //00000000000000001111
        //00000000000000000111
        //00000000000000000011
        //00000000000000000001

            //값 바꾸기 정렬
            //bitmap.length "10", bitmap.length[i][] "20"
            for (int i = 0; i < bitmap.length; i++)
                for (int j = 0; j < bitmap[i].length/2; j++) {
                    int temp = bitmap[i][(bitmap[i].length-1) - j];
                    bitmap[i][(bitmap[i].length-1) - j] = bitmap[i][j];
                    bitmap[i][j] = temp;
                }
            //i 0        |  1        |        2 |        3 | ....
            //j 0 <-> 19 |  1 <-> 18 | 2 <-> 17 | 3 <-> 16 | ....
        }

        System.out.println("자리변경 완료");

        //i=10 j=20
        for (int i = 0; i < bitmap.length; i++) {
            for (int j = 0; j < bitmap[i].length; j++) {
                System.out.print(bitmap[i][j]);
            }
            System.out.println();
        }

        // 4. res/bitmap-out.txt 파일로 bitmap 배열의 값들을 저장
        {
            FileOutputStream fos = new FileOutputStream("afterschool/res/bitmap_out.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            for (int i = 0; i < bitmap.length; i++) {
                for (int j = 0; j < bitmap[i].length; j++) {
                    fout.print(bitmap[i][j]);
                }
                fout.println();
            }
                fout.close();
                fos.close();
        }
    }

    }

