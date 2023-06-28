package com.newlecture.app.ex8.function;

public class Program2 {
    //로또번호 저장하기
    public static int[][] creatLottos(){
        int[][] lottos={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};

        return lottos;
    }
    //로또 출력
    public static void printLottos(int[][] lottos){
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%4d, ",lottos[i][j]);

            System.out.println();
        }
    }
    //로또 저장소 바꿔주기
    public static void swapLottos(int[][] lottos,int i,int j){
        int[] temp = lottos[i];
        lottos[i]=lottos[j];
        lottos[j]=temp;
    }

    public static void main(String[] args) {

        int[][] lottos = creatLottos();//로또번호 생성 후 lottos에 저장해주기

        //로또 출력
        printLottos(lottos);

        System.out.println("\n-----------첫번째와 세번째 바꾸기-----------\n");

        //로또 저장소 바꿔주기
        swapLottos(lottos,0,2);//값바꾸기

        //로또 출력
        printLottos(lottos);


    }
}
