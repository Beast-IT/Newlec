package 방과후연습용.Jin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;
//        :  제어구조 + 배열
//        —------------------------------------------------------------------

public class Ex_0622_2 {
    public static void main(String[] args) throws IOException {
        //문제 1) nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
        //90 87 20 30 29 39 49 38 10 19 87 29 38 27 8
        int[] nums = new int[15];// 숫자 저장 공간
        Random rand=new Random();
        //문제 2) res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다.
        // 값 로드하기
        {
            FileInputStream fis = new FileInputStream("afterschool/res/data2.txt");
            Scanner sc = new Scanner(fis);

            for (int i = 0; sc.hasNext(); i++) {
                nums[i] = sc.nextInt();
            }
            sc.close();
            fis.close();
            System.out.println("로드 완료");
        }

        //문제 3) 0~14 범위의 랜덤값 2개를 얻어서 그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.
        {
            for(int i=0;i<50;i++) {
                int random1=(int)rand.nextInt(14)+1;
                int random2=(int)rand.nextInt(14)+1;

                int temp=nums[random1];
                nums[random1]=nums[random2];
                nums[random2]=temp;
            }
            System.out.println("번호 섞기 완료");
        }

        //문제 4
        // 값 저장하기
        {
            FileOutputStream fos = new FileOutputStream("afterschool/res/data2_out.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            //파일 출력
            for (int i = 0; i < nums.length; i++)
                fout.printf("%d ", nums[i]);

            //콘솔 출력
            for (int i = 0; i < nums.length; i++)
                System.out.printf("%3d ", nums[i]);

            fout.close();
            fos.close();
        }
    }
}
