package com.newlecture.app.ex7.zarray;

public class Program {
    public static void main(String[] args) {
        //int[][] lottos=new int[3][6];
        //int[][] lottos=new int[3][6]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
        int[][] lottos={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%4d, ",lottos[i][j]);

            System.out.println();
        }
        System.out.println(System.identityHashCode(lottos[0]));
        System.out.println(System.identityHashCode(lottos[1]));
        System.out.println(System.identityHashCode(lottos[2]));

        System.out.println("------ 0<->2 위치 변경 --------");

        int[] temp = lottos[0];
        System.out.println(System.identityHashCode(temp[0]));
        lottos[0]=lottos[2];
        lottos[2]=temp;

        System.out.println(System.identityHashCode(lottos[0]));
        System.out.println(System.identityHashCode(lottos[1]));
        System.out.println(System.identityHashCode(lottos[2]));

        /*
        [1] <-> [2]

        lottos         ->2차 배열의 이름
        lottos[0]      ->1차 배열의 이름
        lottos[0][0]   ->정수 변수의 이름

        int x = lottos[0][0];     값 변수는 값을 대입하는 연산이 이루어진다.
        int[] xes = lottos[0][0]; (x) 계층이 달라요.
        int[] xes = lottos[0];    참조 변수는 새로운 이름을 만드는 것이다.
        int[] xes = lottos; (x)   계층이 달라요.
        int[][] xes = lottos;     (o) 쌉가능!

        */
        //이렇게 대입하면 처음에 선언한 배열 크기에 맞게 늘어간다.
        //다른 배열을 만들때는 new를 사용해서 해야한다.
        lottos[1]=new int []{9,9,9,9,9,9,9,9,9,9};

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%4d, ",lottos[i][j]);

            System.out.println();
        }

    }
}
