package com.newlecture.app.ex8.function;

public class BasicProgram2 {
    static int sum(int n) {
        int total = (n * (n + 1)) / 2;
        return total;
    }

    static int power(int x) {
        return ((x + 3) * (x + 3) + x / 3 * (x - 2) + 5);
    }

    public static void main(String[] args) {
        //int result = 1+2+3+4+5+6+7+8+9+10~n;
        int result = sum(11);
        System.out.printf("result : %d\n", result);

        //(x+3)*(x+3)+ x/3*(x-2)+5
        int result2 = power(7) + 3 + power(7) - power(3);
        System.out.printf("result : %d\n", result2);

        int a1 = f1();
        int a2 = f2(20, 30);
        f3(33);
        f4(9);

//        int[] lotto = new int[3];
//        print(3,5.3f,lotto);


        char[][] names = new char[3][10];

        double cnt = print(true, 4.0, names);
    }

    static double print(boolean a, double b, char[][] c) {
        return 2.2;
    }

    //print(2,3.0f,'a') 함수로 만들어보자!
//    static void print(int i, float f,int[] a){
//        System.out.printf("출력 값 : %d %.2f %c\n",i,f,a[0]);
//    }
    private static void f4(int i) {
        System.out.printf("출력 값 : %d\n", i);
    }

    private static void f3(int i) {

    }

    private static int f2(int i, int i1) {
        return 0;
    }

    private static int f1() {
        return 0;
    }
}
