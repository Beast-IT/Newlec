package com.newlecture.app.ex8.function;

public class StaticProgram {
    public static void main(String[] args) {
        // count를 구하는 코드
            int count=0;
        {
            count=39;
        }
        //count를 출력하는 코드
        {
            System.out.printf("count is %d\n",count);
        }
    }
}
