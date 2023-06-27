package com.newlecture.app.ex8.function;

public class Program {
    public static void main(String[] args) {
        //로또번호 저장하기   <- 나
        //lottos 배열을 생성 <- 선생님
        int[][] lottos={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};

        //로또 출력              <- 나
        //lottos 배열을 출력한다. <- 선생님
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%4d, ",lottos[i][j]);

            System.out.println();
        }
        System.out.println("------ 0<->2 위치 변경 --------");

        //로또값 저장소바꿔주기                 <- 나
        //lottos의 1번째와 3번째 순서를 바꾼다. <- 선생님
        int[] temp = lottos[0];
        lottos[0]=lottos[2];
        lottos[2]=temp;

        //로또 출력
        //lottos 배열을 출력한다. <- 선생님
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%4d, ",lottos[i][j]);

            System.out.println();
        }

    }
}
