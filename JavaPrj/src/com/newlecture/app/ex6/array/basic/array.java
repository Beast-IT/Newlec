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
public class array {
	public static void main(String[] args) throws IOException {
		int[] nums = new int[12];// 숫자 저장 공간
		int temp = 0;
		int index = 0;

		// 값 로드하기
		{
			FileInputStream fis = new FileInputStream("res/Data/data.txt");
			Scanner sc = new Scanner(fis);
			
			

			for (int i = 0; sc.hasNext(); i++)
				nums[i] = sc.nextInt();
			
			sc.close();
			fis.close();
		}

		//nums 출력하기
		//100, 23, ...70
		{
			for(int i=0;i<nums.length;i++)
				System.out.printf("%3d ",nums[i]);
		}
		System.out.println();
		
		
		// 위치 찾기
		{
			for (int i = 0; i < nums.length; i++)
				if (nums[i] == 90)
					index = i;
		}

		// 값 바꾸기
		{
			temp = nums[index];
			nums[index] = nums[0];
			nums[0]=temp;
		}
		
		// 값 저장하기
		{
			FileOutputStream fos = new FileOutputStream("res/Data/data_out.txt");
			PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
			
			//파일 출력
			for(int i=0;i<nums.length;i++)
				fout.printf("%d ",nums[i]);
			
			//콘솔 출력 
			for(int i=0;i<nums.length;i++)
				System.out.printf("%3d ",nums[i]);
			
			fout.close();
			fos.close();
		}

		
	}
}
