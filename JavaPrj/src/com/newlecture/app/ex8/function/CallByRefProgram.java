package com.newlecture.app.ex8.function;

public class CallByRefProgram {
    public static void main(String[] args) {
        //nums 배열 객체 생성

            int[] nums=new int[10];


        //nums에 값 추가

            int index=0;
            nums[index]=20;
            index++;

            nums[index]=30;
            index++;


        //nums 배열의 값 출력

            for(int i=0;i<index;i++)
                System.out.printf("%d ",nums[i]);

    }
}
