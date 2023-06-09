package com.newlecture.app.ex6.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
 * 문제: 파일에서 값 90을 찾아서 그 값을 1번째 위치 값과 바꾸어 저장하시오.
 *
 *
 *
 *
 *
 * 문제푼날: 230621
 * 풀이: 나
 * 핵심: 줄어드는 값과 고정된 값이 무엇인지 구분한다.
 * */
public class array {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[100];// 숫자 저장 공간

        int size = 0;//데이터 Size측정

        // 값 로드하기
        {
            FileInputStream fis = new FileInputStream("JavaPrj/res/Data/data.txt");
            Scanner sc = new Scanner(fis);

            for (int i = 0; sc.hasNext(); i++) {
                nums[i] = sc.nextInt();
                size++;
            }
            sc.close();
            fis.close();
        }

        //nums 출력하기
        //100, 23, ...70
        {
            for (int i = 0; i < size; i++)
                System.out.printf("%3d ", nums[i]);
        }
        System.out.println();

//        int index = -1;// index가 0부터 시작하면 배열에서 0값으로 인식할 수 있어서 범위 밖에있는 값 지정.
//        // 위치 찾기
//        {
//            for (int i = 0; i < size; i++)
//                if (nums[i] == 90) {
//                    index = i;
//                    break;//효율을 위해서!
//                }
//        }

//        // 값 바꾸기
//        {
//            int temp;//temp라는 변수는 이 구역에서만 사용해서 여기에 변수를 선언했음
//            temp = nums[index];
//            nums[index] = nums[0];
//            nums[0] = temp;
//        }
//        //제일 큰 값 찾기 max방에 저장하기.
//        {
//            int max = nums[0];
//
//            //2번째(=인덱스1) 숫자부터 겨루기를 해서 왕좌를 탈환하라.
//            //몇번의 반복? size-1
//
//            for (int i = 0; i < size - 1; i++)
//                if (max < nums[i])
//                    max = nums[i];
//
//            System.out.printf("max : %d\n", max);
//        }
//
//        //제일 큰 값 찾기 옆으로 미루기! 제일 마지막 index값이 큰값이 나온다.
//        {
//            //2번째(=인덱스1) 숫자부터 겨루기를 해서 왕좌를 탈환하라.
//            //몇번의 반복? size-1
//            for (int i = 0; i < size - 1; i++)
//                if (nums[i] > nums[i + 1]) {
//                    int temp = nums[i]; //선생님 변수 선언 방법
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = temp;
//                }
//            System.out.printf("max : %d\n", nums[size - 1]);
//            for (int i = 0; i < size; i++)
//                System.out.printf("%3d ", nums[i]);
//            System.out.println();
//        }

//        //최솟값의 인덱스 찾기 ( 위에 값 바꾸기를 주석처리해야지 제대로 나온다)
//        {
//            int minIndex = 0;
//
//            //몇번의 반복? size-1
//            for (int i = 0; i < size - 1; i++)
//                if (nums[minIndex] > nums[i + 1]) {
//                    minIndex = (i + 1);
//                }
//
//            System.out.printf("최소값 인덱스는 %d 입니다.\n", minIndex);
//        }

        //정렬하기 (버블정렬)
//        {
//            //1등 찾기 -> 비교를 위한 반복횟수 size -1
//            //2등 찾기 -> 비교를 위한 반복횟수 size -2
//            //3등 찾기 -> 비교를 위한 반복횟수 size -3
//
//            //size-1 등까지 찾기 -> 비교를 위한 반복횟수 1
//            int temp = 0;
//            //몇번의 반복? size-1
//
//            for (int i = 0; i < (size - 1); i++)
//                for (int j = 0; j < (size - 1) - i; j++) {
//                    if (nums[j] > nums[j + 1]) {
//                        temp = nums[j];
//                        nums[j] = nums[j + 1];
//                        nums[j + 1] = temp;
//                    }
//                }
//
//        }

        //선택정렬
        {
            //1단계
//            {
//                int j = 0;//시작 인덱스
//                int minIndex = 0;
//                for (int i = 0; i < size - 1 - j; i++)
//                    if (nums[minIndex] > nums[i + 1])
//                        minIndex = i + 1;
//
//
//                int temp = nums[j];
//                nums[j] = nums[minIndex];
//                nums[minIndex] = temp;
//
//                //콘솔 출력
//                for (int i = 0; i < size; i++)
//                    System.out.printf("%3d ", nums[i]);
//
//                System.out.printf("\nmin index : %d\n", minIndex);
//            }
            //2단계
//            {
//                int j = 1;// 현재위치
//                int minIndex = 1;
//
//                for (int i = 0; i < size - 1 - j; i++)
//                    if (nums[minIndex] > nums[i + 2])
//                        minIndex = i + 2;
//
//
//                int temp = nums[j];
//                nums[j] = nums[minIndex];
//                nums[minIndex] = temp;
//
//                //콘솔 출력
//                for (int i = 0; i < size; i++)
//                    System.out.printf("%3d ", nums[i]);
//                System.out.println();
//            }

            {//완성본 (선택정렬)
                for (int j = 0; j < size - 1; j++) {
                    int minIndex = j;//배열의 인덱스 0부터 증가하기 때문에 j는 minIndex이다.(앞에서 작은값을 순차적으로 저장해서)
                    for (int i = 0; i < (size - 1) - j; i++) {
                        if (nums[minIndex] > nums[i + (1 + j)])
                            minIndex = i + (1 + j);
                    }
                    //j <-> minIndex
                    int temp = nums[j];
                    nums[j] = nums[minIndex];
                    nums[minIndex] = temp;
                }
            }
        }


        // 값 저장하기
        {
            FileOutputStream fos = new FileOutputStream("JavaPrj/res/Data/data_out.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            //파일 출력
            for (int i = 0; i < size; i++)
                fout.printf("%d ", nums[i]);

            //콘솔 출력
            for (int i = 0; i < size; i++)
                System.out.printf("%3d ", nums[i]);

            fout.close();
            fos.close();
        }


    }
}
