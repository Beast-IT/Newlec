package com.newlecture.app.ex7.zarray;

import java.util.Random;

public class test {

    public static void main(String[] args) {
        int[][] lottos = new int[3][3];

        Random random = new Random();

        int[] lotto = new int[6];

        //같은 객체에다가 값 덮어쓰고 ~~~~~같은 주소나옴

        for (int j = 0; j < lottos.length; j++) {
            for (int i = 0; i < lotto.length; i++)
                lotto[i] = random.nextInt(45) + 1;

            lottos[j] = lotto;
        }

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lotto.length; j++)
                System.out.print(lottos[i][j]);
            System.out.println();
        }
    }

}