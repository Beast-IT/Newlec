package 방과후연습용.Jin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Ex_0622_1_array_version {
    public static void main(String[] args) throws IOException {
//        문제 1:
//        res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
//        90 87 20 30 29 39 49 38 10 19 87 29 38 27 8
//        문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.

        FileInputStream fis = new FileInputStream("afterschool/res/data.txt");
        Scanner sc = new Scanner(fis);

        int count = 0;
        int[] nums = new int[100];

//        문제 1) 값들의 갯수를 구하는 코드
        {
            for (int i = 0; sc.hasNext(); i++) {
                nums[i] = sc.nextInt();
                count++;
            }
            sc.close();
            fis.close();
            System.out.printf("count is %d\n", count);
        }

//        //문제 2) 이 값들 중에서 가장 큰 값이 무엇인지 출력하는 코드를 작성하시오.(배열)
//        int max = -1;
//        {
//            for (int i = 0; i < count - 1; i++)
//                if (max < nums[i]) {
//                    max = nums[i];
//                }
//            System.out.printf("max is %d\n", max);
//        }


        //문제 2-1) 이 값들 중에서 가장 큰 값이 무엇인지 출력하는 코드를 작성하시오.(노 배열)
        FileInputStream fis1 = new FileInputStream("afterschool/res/data.txt");
        Scanner sc1 = new Scanner(fis1);
        //스캐너는 Stream이여서 단방향으로반 흘러감. 즉 빠꾸가 불가능함! 새로운 객체생성!

        int max = -1;
        {
            for (; sc1.hasNext(); ) {
                int num = sc1.nextInt();
                if (max < num) {
                    max = num;
                }
            }
            System.out.printf("max is %d\n", max);

            sc.close();
        }

        //문제 3) 이 값들 중에 10을 찾아서 그 위치(인덱스 값)을 출력하시오.
        int index = -1;
        {
            for (int i = 0; i < count - 1; i++)
                if (nums[i] == 10) {
                    index = i;
                }
            System.out.printf("index is %d\n", index);
        }
        // 값 저장하기
        {
            FileOutputStream fos = new FileOutputStream("afterschool/res/data_out.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            fout.close();
            fos.close();
        }
    }
}
