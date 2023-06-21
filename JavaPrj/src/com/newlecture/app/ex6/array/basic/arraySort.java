package com.newlecture.app.ex6.array.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
 * 문제: 파일에서 값 90을 찾아서 그 값을 1번째 위치 값과 바꾸어 저장하시오.
 * 		     *
 * 		    **
 * 		   ***
 * 		  ****
 * 		 *****
 * 문제푼날: 230621
 * 풀이: 나
 * 핵심: 줄어드는 값과 고정된 값이 무엇인지 구분한다.
 * */
public class arraySort {
    public static void main(String[] args) throws IOException {
        int[] nums = {20, 23, 46, 46, 50, 50, 57, 70, 80, 82, 90, 100};// 숫자 저장 공간
        int temp = 0;
        int index = 0;

        int i = 0, j = 0;

        for (i = 0; i < nums.length; i++) {
            int min = 100000;
            for (j = 0; j < nums.length; j++) {
				if(true){

				}
            }
        }


    }
}
