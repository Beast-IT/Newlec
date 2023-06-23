package com.newlecture.app.ex6.array.lotto;

import java.util.Random;

public class LottoProgram {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        boolean repeat = false;

        Random rand = new Random();//Random(45)는 0~44까지의 범위를 만든다.

        while (!repeat) {
            // 1. lottol 배열을 랜덤한 값들로 채우고
            {
                for (int i = 0; i < lotto.length; i++)
                    lotto[i] = rand.nextInt(45) + 1;
            }

            // 2. 정렬을 한 후에
            {
                for (int i = 0; i < lotto.length - 1; i++) {
                    int minIndex = i;
                    for (int j = 0; j < lotto.length - 1 - i; j++) {
                        if (lotto[minIndex] > lotto[j + 1 + i])
                            minIndex = i + j + 1;
                    }
                    int temp = lotto[i];
                    lotto[i] = lotto[minIndex];
                    lotto[minIndex] = temp;
                }
            }
            //추가문제(개인 연습) 중복제거
            {
                for (int i = 0; i < lotto.length; i++) {
                    for (int j = 0; j < lotto.length - 1; j++) {
                        if (lotto[i] == lotto[(j + 1)])
                            repeat = true;
                    }
                }
            }
        }

        // 3. lottol 배열의 값들을 출력하시오.
        // 단, 출력 포맷은 예를 들어 3,4,21,24,30,42 처럼 출력되도록 한다. 마지막 숫자에는 쉼표(,)가 없어야 한다.
        {
            for (int j = 0; j < lotto.length; j++)
                System.out.printf("%d, ", lotto[j]);
        }
        System.out.print("\b\b");//이스케이프 문자 지우기.
    }
}
