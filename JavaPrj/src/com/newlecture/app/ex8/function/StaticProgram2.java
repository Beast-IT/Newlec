package com.newlecture.app.ex8.function;

public class StaticProgram2 {
    //class는 데이터를 정의할때 사용한다.
    //static은 전역이다. 전역변수(Global variable)를 선언할때는
    // static을 앞에 붙여야한다.

    //변수의 우선 순위 "지역변수" <- "전역변수"
    //static int count=0;

    public static void main(String[] args) {

        // count를 구하는 코드
       int count = getCount();

        //count를 출력하는 코드
        printCount(count);//Call By Value

    }

    private static int getCount() {
        int count;
        count = 39;
        return count;
    }

    private static void printCount(int c) {
        System.out.printf("count is %d\n", c);
    }
}
