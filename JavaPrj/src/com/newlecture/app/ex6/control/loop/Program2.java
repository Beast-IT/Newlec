package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		// students1.txt 파일에 저장된 학생 이름들을 읽어서 성을 제외한 이름을 students1-out.data 파일에 저장하시오.
		// 단. 파일에 저장된 학생의 수는 5명이다.
		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		// { } 이 지역에서만 쓸수 있게 해준다.(지역화)
		// 좋은 코드는 코드를 유지 관리하기 편한 코드가 좋은 코드이다.

		// 내가 한것! 삼항연산자 추가!

		for (int i = 0; i < 5; i++) {
			String one = fscan.nextLine();
			
			String name = one.substring(one.length()-2, one.length());

			String pt = (one.length() <= 2 && one.length() <= 3 ? "이름은 3글자입니다." : name);
			fout.println(pt);

		}

		// 쌤이 한것!
//		{
//			String line = fscan.nextLine();
//			String name = line.substring(1, 3);
//			fout.println(name);
//		}
//
//		{
//			String line = fscan.nextLine();
//			String name = line.substring(1, 3);
//			fout.println(name);
//		}
//
//		{
//			String line = fscan.nextLine();
//			String name = line.substring(1, 3);
//			fout.println(name);
//		}
//
//		{
//			String line = fscan.nextLine();
//			String name = line.substring(1, 3);
//			fout.println(name);
//		}
//		// 마지막 "얍" 때문에 오류가 발생한다. IndexOutOfBound: begin 1, end 3, length2
//		{
//			String line = fscan.nextLine();
//			String name = line.substring(1, 3);
//			fout.println(name);
//		}

		fout.close();
		fos.close();

		fscan.close();
		fis.close();

		System.out.println("작업 완료");
	}

}
