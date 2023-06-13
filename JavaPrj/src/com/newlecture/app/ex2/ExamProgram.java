package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) throws IOException {

		int kor1, kor2, kor3, kor4, kor5, kor6;
		int total;
		float avg;

		// 성적 계산
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		kor4 = 0;

		FileInputStream fis = new FileInputStream("res/Exam.txt");// DB파일 만들어서 내용 가져옴. 버퍼역활을 함.
		Scanner fscan = new Scanner(fis);

		fscan.nextLine();// "국어, 영어, 수학"-> 한줄을 읽어온다. 저장공간이 없으면 읽고 버림. 그리고 그 다음값 읽음
		String line = fscan.nextLine();//30, 86, 97 -> line이라는 저장공간에 값을 저장함.

		String kor1_ = fscan.next();// "30" 문자 읽어와서 숫자로 변경한다.
		kor1 = Integer.parseInt(kor1_);// "30"->30 숫자로 변경하는 과정.
//		System.out.println(kor1);
		String kor2_ = fscan.next();// "86" 문자 읽어와서 숫자로 변경한다.
		kor2 = Integer.parseInt(kor2_);// "86"->86 숫자로 변경하는 과정.
//		System.out.println(kor2);
		String kor3_ = fscan.next();// "97" 문자 읽어와서 숫자로 변경한다.
		kor3 = Integer.parseInt(kor3_);// "97"->97 숫자로 변경하는 과정.
//		System.out.println(kor3);

	
		
//		System.out.println(kor1);
//		kor2 = fscan.nextInt();/실행시키면 오류가 발생한다.
//		System.out.println(kor2);
//		kor3 = fscan.nextInt();
//		System.out.println(kor3);

//		kor1 = fis.read(); // 1 byte로 읽어온다. 
//		kor2 = fis.read();
//		kor3 = fis.read();
//		kor4 = fis.read();

		fscan.close();
		fis.close();

		// 성적 출력
		total = kor1 + kor2 + kor3;
		avg = total / (float) 3;

		// 성적 저장(Exam.txt)
		FileOutputStream fos = new FileOutputStream("res/Exam-Out.txt");// 버퍼영역
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		fout.printf("total is %d\n", total);
		fout.printf("avg is %f\n", avg);

		fout.close();
		fos.close();

		System.out.println("작업완료");
		

//		9(1) 5(2) 6(3) 3(4) 2(5)
//		
//		a
//		b
//		tmp
//		
//		
//		


	}

}
