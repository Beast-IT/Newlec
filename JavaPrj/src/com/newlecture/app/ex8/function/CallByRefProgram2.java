package com.newlecture.app.ex8.function;

public class CallByRefProgram2 {
    public static void main(String[] args) {
        int index = 0;
//        Integer a = Integer.valueOf(0);

        //nums 배열 객체 생성
        int[] nums = createNums();

        //nums에 값 추가
//        int index = inputNums(nums);//Call By Ref
        inputNums(nums, index);//Call By Value(index)

        //nums 배열의 값 출력
        printNums(index, nums);//value, Call By Ref
    }

    private static void printNums(int size, int[] nums) {
        for (int i = 0; i < size; i++)
            System.out.printf("%d ", nums[i]);
    }

    private static void inputNums(int[] nums, int index) {
        nums[index] = 20;
        index++;

        nums[index] = 30;
        index++;

        nums[index] = 90;
        index++;

    }

    private static int[] createNums() {
        return new int[10];
    }
}
