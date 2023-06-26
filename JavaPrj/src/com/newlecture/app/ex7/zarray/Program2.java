package com.newlecture.app.ex7.zarray;

public class Program2 {
    public static void main(String[] args) {
        int[][] lottos = new int[3][];

        //첫 번째 로또 입력
        {
            int[] temp = new int[6];
            temp[0]=20;
            temp[1]=30;

            lottos[0]=temp;
            System.out.println(lottos[0]);
            System.out.println(lottos[0][1]);
        }
    }
}
