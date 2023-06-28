package com.newlecture.app.ex8.function;

public class CallByRefProgram2 {
    public static void main(String[] args) {

        //nums 배열 객체 생성
        int[] nums = createNums();

        //nums에 값 추가
        int index = inputNums(nums);

        //nums 배열의 값 출력
        printNums(index,nums);
    }

    private static void printNums(int index,int[] nums) {
        for(int i=0;i<index;i++)
            System.out.printf("%d ",nums[i]);
    }

    private static int inputNums(int[] nums) {
        int index=0;
        nums[index]=20;
        index++;

        nums[index]=30;
        index++;
        return index;
    }

    private static int[] createNums() {
        return new int[10];
    }
}
