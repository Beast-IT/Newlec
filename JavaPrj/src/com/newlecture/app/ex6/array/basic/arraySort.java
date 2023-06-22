package com.newlecture.app.ex6.array.basic;

import java.io.IOException;

/*
 * 문제:

 * 문제푼날: 230621
 * 풀이: 나
 * 핵심: 줄어드는 값과 고정된 값이 무엇인지 구분한다.
 * */
public class arraySort {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};// 숫자 저장 공간

        int temp = 0;
        //몇번의 반복? size-1

        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < (nums.length - 1) - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j]; //선생님 변수 선언 방법
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        for (int i = 0; i < nums.length; i++)
            System.out.printf("%d ", nums[i]);

    }
}
